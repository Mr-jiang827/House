package com.housedemo.houseapi.service;

import com.housedemo.houseapi.dto.UserRegisterCodeDto;
import com.housedemo.houseapi.vo.R;

public interface SmsService {

    //发送短信-注册验证码
    R sendRegisterCode(String phone);
    //校验--注册验证码
    R checkRCode(UserRegisterCodeDto codeDto);
}
