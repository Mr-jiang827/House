package com.housedemo.houseapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.housedemo.houseapi.dao")
public class HouseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseApiApplication.class, args);
    }

}
