package com.housedemo.houseapi.controller;

import com.housedemo.houseapi.dto.UserDto;
import com.housedemo.houseapi.service.UserService;
import com.housedemo.houseapi.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: HungryApi
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-06-18 16:08
 */
@Api(value = "登录注册等接口", tags = "登录注册接口")
@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/api/user/checkphone.do")
    public R check(String phone) {
        return service.checkPhone(phone);
    }

    @PostMapping("/api/user/register.do")
    public R register(@RequestBody UserDto dto) {
        return service.register(dto);
    }

    @PostMapping("/api/user/login.do")
    public R login(@RequestBody UserDto dto) {
        return service.login(dto);
    }

    @PostMapping("/api/user/checktoken.do")
    public R checkToken(String token) {
        return service.checkToken(token);
    }


}
