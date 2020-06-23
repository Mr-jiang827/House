package com.housedemo.houseapi.utils;

import java.util.Random;

public class NumRandomUtil {

    public static int createNum(int len) {
        Random random = new Random();
        return (int)(random.nextInt((int)(Math.pow(10,len) - Math.pow(10,len - 1))) + Math.pow(10,len - 1));
    }
}
