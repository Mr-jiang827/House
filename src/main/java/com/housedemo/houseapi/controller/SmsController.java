package com.housedemo.houseapi.controller;

import com.housedemo.houseapi.dto.UserRegisterCodeDto;
import com.housedemo.houseapi.service.SmsService;
import com.housedemo.houseapi.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: HungryApi
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-06-18 10:38
 */
@Api(value = "短信相关接口",tags = "短信接口")
@RestController
@CrossOrigin //解决跨域的问题
public class SmsController {
    @Autowired
    private SmsService smsService;

    //
    @GetMapping("api/sms/sendrcode.do")
    public R sendRcode(String phone){
        return smsService.sendRegisterCode(phone);
    }
    //
    @PostMapping("api/sms/checkrcode.do")
    public R checkRCode(@RequestBody UserRegisterCodeDto codeDto){
        return smsService.checkRCode(codeDto);
    }
}
