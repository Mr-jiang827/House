package com.housedemo.houseapi.entity;

public class TCounselor {
    private Integer id;

    private String counselor;

    private Integer premisesld;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor == null ? null : counselor.trim();
    }

    public Integer getPremisesld() {
        return premisesld;
    }

    public void setPremisesld(Integer premisesld) {
        this.premisesld = premisesld;
    }
}