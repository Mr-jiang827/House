package com.housedemo.houseapi.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.housedemo.houseapi.config.RedisKeyConfig;
import com.housedemo.houseapi.dao.TUserMapper;
import com.housedemo.houseapi.dao.TUserdetailMapper;
import com.housedemo.houseapi.dto.LoginTokenDto;
import com.housedemo.houseapi.dto.UserDto;
import com.housedemo.houseapi.entity.TUser;
import com.housedemo.houseapi.entity.TUserdetail;
import com.housedemo.houseapi.service.UserService;
import com.housedemo.houseapi.three.JedisCore;
import com.housedemo.houseapi.three.JwtCore;
import com.housedemo.houseapi.type.RCodeType;
import com.housedemo.houseapi.utils.EncryptUtil;
import com.housedemo.houseapi.utils.RUtils;
import com.housedemo.houseapi.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/23 11:23
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JedisCore jedisCore;

    @Value("${hungry.passkey}")
    private String key;

    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private TUserdetailMapper tUserdetailMapper;

    @Override
    public R checkPhone(String phone) {
        TUser tUser = tUserMapper.selectByPhone(phone);
        if (tUser == null) {
            return RUtils.setOk();
        } else {
            return RUtils.setError("手机号已存在");
        }

    }

    @Override
    public R register(UserDto userDto) {
        if (checkPhone(userDto.getPhone()).getCode() == RCodeType.成功.getVal()) {
            TUser tUser = new TUser();

            tUser.setPassword(EncryptUtil.aesenc(key, userDto.getPass()));
            tUser.setPhone(userDto.getPhone());
            tUserMapper.insert(tUser);

            TUser user = tUserMapper.selectByPhone(userDto.getPhone());
            TUserdetail userdetail = new TUserdetail();
            userdetail.setUid(user.getId());
            tUserdetailMapper.insert(userdetail);
            return RUtils.setOk();
        } else {
            return RUtils.setError("手机号已存在");
        }
    }

    @Override
    public R login(UserDto userDto) {
        if (jedisCore.checkKey(RedisKeyConfig.LOGIN_TOKEN + userDto.getPhone())) {

            return RUtils.setError("你已经登录");

        } else {
            TUser tUser = tUserMapper.selectByPhone(userDto.getPhone());
            if (tUser != null) {
                LoginTokenDto loginTokenDto = new LoginTokenDto(tUser.getId(), userDto.getPhone(), LocalDateTime.now());
                String token = JwtCore.createToken(JSON.toJSONString(loginTokenDto));
                jedisCore.set(RedisKeyConfig.LOGIN_USER + token,JSON.toJSONString(token),RedisKeyConfig.LOGIN_TOKEN_TIME);
                jedisCore.set(RedisKeyConfig.LOGIN_TOKEN + userDto.getPhone(),token,RedisKeyConfig.LOGIN_TOKEN_TIME);
                jedisCore.set(RedisKeyConfig.LOGIN_STATUS + userDto.getPhone(),JSON.toJSONString(tUser));
                System.out.println(jedisCore.get(RedisKeyConfig.LOGIN_STATUS + userDto.getPhone()));

                return RUtils.setOk(token);
            }
            return RUtils.setError("用户名密码错误");
        }

    }

    @Override
    public R checkToken(String token) {
        if (jedisCore.checkKey(RedisKeyConfig.LOGIN_USER + token)) {
            return RUtils.setOk();
        } else {
            return RUtils.setError("身份已过期");
        }

    }

    @Override
    public R exit(String token) {
        if (jedisCore.checkKey(RedisKeyConfig.LOGIN_USER + token)) {
            TUser tUser = JSON.parseObject(jedisCore.get(RedisKeyConfig.LOGIN_USER + token), TUser.class);
            jedisCore.del(RedisKeyConfig.LOGIN_USER + token);
            jedisCore.del(RedisKeyConfig.LOGIN_TOKEN + tUser.getPhone());
            jedisCore.del(RedisKeyConfig.LOGIN_STATUS + tUser.getPhone());
            return RUtils.setOk();
        } else {
            return RUtils.setError("令牌已失效");
        }

    }
}
