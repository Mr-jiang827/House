package com.housedemo.houseapi.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisKeyConfig {
    public static final String SMS_RCODE="house:sms:rcode:";
    public static final int SMS_RCODE_TIME=300;

    //存储登陆相关信息
    public static final String LOGIN_TOKEN="house:login:phone:";//后面追加手机号 值 存储令牌
    public static final String LOGIN_USER="house:login:token:";//后面追加令牌 值 存储用户信息

    public static final int LOGIN_TOKEN_TIME=1800;//有效期30分钟

    public static final String LOGIN_STATUS="house:login:status:";//后面追加手机号 用户对象值 存储用户状态

}
