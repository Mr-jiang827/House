package com.housedemo.houseapi.service.impl;

import com.housedemo.houseapi.config.RedisKeyConfig;
import com.housedemo.houseapi.dto.UserRegisterCodeDto;
import com.housedemo.houseapi.except.SmsException;
import com.housedemo.houseapi.service.SmsService;
import com.housedemo.houseapi.three.JedisCore;
import com.housedemo.houseapi.three.SmsCore;
import com.housedemo.houseapi.utils.NumRandomUtil;
import com.housedemo.houseapi.utils.RUtils;
import com.housedemo.houseapi.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/23 8:14
 * @Version: 1.0
 */
@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private JedisCore jedisCore;

    int code;
    @Override
    public R sendRegisterCode(String phone) {
        if (jedisCore.checkKey(RedisKeyConfig.SMS_RCODE + phone)) {
            code = Integer.parseInt(jedisCore.get(RedisKeyConfig.SMS_RCODE + phone));
        } else {
            int num = NumRandomUtil.createNum(6);
            code = num;
            jedisCore.set(RedisKeyConfig.SMS_RCODE + phone,Integer.toString(code),RedisKeyConfig.SMS_RCODE_TIME);
        }

        try {
            SmsCore.sendRCode(phone, code);

            //添加导数据库

            return RUtils.setOk();
        } catch (SmsException e) {
            e.printStackTrace();
            return RUtils.setError();
        }



    }

    @Override
    public R checkRCode(UserRegisterCodeDto codeDto) {
        if (codeDto.getCode() == Integer.parseInt(jedisCore.get(RedisKeyConfig.SMS_RCODE + codeDto.getPhone()))) {
            jedisCore.del(RedisKeyConfig.SMS_RCODE + codeDto.getPhone());
            return RUtils.setOk();

        } else {

            return RUtils.setError();

        }

    }
}
