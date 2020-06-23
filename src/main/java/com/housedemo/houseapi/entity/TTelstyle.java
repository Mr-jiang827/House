package com.housedemo.houseapi.entity;

public class TTelstyle {
    private Integer id;

    private Integer premisesld;

    private String tel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPremisesld() {
        return premisesld;
    }

    public void setPremisesld(Integer premisesld) {
        this.premisesld = premisesld;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}