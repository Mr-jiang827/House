package com.housedemo.houseapi.three;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author: haha
 * @Description:
 * @Date: 2020/6/23 8:18
 * @Version: 1.0
 */

public class JedisCore {
    private Jedis jedis;

    public JedisCore(String host, int port, String pass) {
        System.out.println(host);
        System.out.println(port);
        System.out.println(pass);
        JedisPool jedisPool1 = new JedisPool(host, port);
        jedis = jedisPool1.getResource();
        jedis.auth(pass);

    }

    public void set(String keys, String val) {
        jedis.set(keys, val);
    }
    //添加
    public void set(String keys, String val, int second) {
        jedis.setex(keys, second, val);
    }

    //删除
    public void del(String keys) {
        jedis.del(keys);
    }

    //查询
    public String get(String keys) {
       return jedis.get(keys);
    }

    //判断
    public boolean checkKey(String keys) {
       return jedis.exists(keys);
    }

    public void expire(String key,int seconds){
        jedis.expire(key,seconds);
    }
}
