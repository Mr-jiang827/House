package com.housedemo.houseapi.utils;


import com.housedemo.houseapi.type.RCodeType;
import com.housedemo.houseapi.vo.R;


public class RUtils {
    public static R setOk(String msg, Object data) {
        return new R(RCodeType.成功.getVal(),msg, data);
    }

    public static R setOk(Object data) {
        return new R(RCodeType.成功.getVal(),"ok", data);
    }

    public static R setOk() {
        return new R(RCodeType.成功.getVal(),"ok", null);
    }


    public static R setError(String msg) {
        return new R(RCodeType.失败.getVal(), msg, null);
    }

    public static R setError() {
        return new R(RCodeType.失败.getVal(), "error", null);
    }

}
