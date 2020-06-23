package com.housedemo.houseapi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private int code;
    private String msg;
    private Object data;

}
