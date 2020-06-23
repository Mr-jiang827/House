package com.housedemo.houseapi.config;

import com.housedemo.houseapi.three.JedisCore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JedisCoreConfig {
    @Value("${hungry.redis.host}")
    private String host;
    @Value("${hungry.redis.port}")
    private int port;
    @Value("${hungry.redis.psw}")
    private String pass;


    @Bean
    public JedisCore createJC(){
        System.out.println(host);
        return new JedisCore(host,port,pass);
    }
}
