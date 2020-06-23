package com.housedemo.houseapi.controller;

import com.housedemo.houseapi.entity.TAdmin;
import com.housedemo.houseapi.service.AdminService;
import com.housedemo.houseapi.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/22 22:12
 * @Version: 1.0
 */
@Api
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("api/admin/insert.do")
    public R add(TAdmin admin) {
        return adminService.add(admin);
    }
}
