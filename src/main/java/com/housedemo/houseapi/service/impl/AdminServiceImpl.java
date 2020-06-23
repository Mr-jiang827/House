package com.housedemo.houseapi.service.impl;

import com.housedemo.houseapi.dao.TAdminMapper;
import com.housedemo.houseapi.entity.TAdmin;
import com.housedemo.houseapi.service.AdminService;
import com.housedemo.houseapi.utils.RUtils;
import com.housedemo.houseapi.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/22 22:09
 * @Version: 1.0
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private TAdminMapper mapper;

    @Override
    public R add(TAdmin admin) {
        if (mapper.insert(admin) > 0) {

            return RUtils.setOk();
        } else {
            return RUtils.setError();
        }


    }
}
