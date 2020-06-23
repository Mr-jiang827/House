package com.housedemo.houseapi.entity;

public class TMyinfo {
    private Integer id;

    private String infocontent;

    private Integer status;

    private Integer uid;

    private String fieldb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfocontent() {
        return infocontent;
    }

    public void setInfocontent(String infocontent) {
        this.infocontent = infocontent == null ? null : infocontent.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFieldb() {
        return fieldb;
    }

    public void setFieldb(String fieldb) {
        this.fieldb = fieldb == null ? null : fieldb.trim();
    }
}