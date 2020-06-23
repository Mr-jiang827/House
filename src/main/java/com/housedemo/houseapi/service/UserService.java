package com.housedemo.houseapi.service;

import com.housedemo.houseapi.dto.UserDto;
import com.housedemo.houseapi.vo.R;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/23 8:44
 * @Version: 1.0
 */
public interface UserService {
    //检查手机号是否存在
    R checkPhone(String phone);

    //注册新用户
    R register(UserDto userDto);

    //登录
    R login(UserDto userDto);

    //检验登录令牌的有效性
    R checkToken(String token);

    //退出

    R exit(String token);
}
