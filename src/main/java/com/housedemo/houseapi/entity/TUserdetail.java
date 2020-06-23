package com.housedemo.houseapi.entity;

public class TUserdetail {
    private Integer id;

    private Integer uid;

    private String headurl;

    private String nickname;

    private Integer mid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}