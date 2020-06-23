package com.housedemo.houseapi.type;

public enum RCodeType {
    成功(200),失败(500);

    private int val;
    private RCodeType(int v){
        val=v;
    }

    public int getVal() {
        return val;
    }
}
