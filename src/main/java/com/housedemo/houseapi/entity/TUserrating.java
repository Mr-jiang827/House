package com.housedemo.houseapi.entity;

import java.util.Date;

public class TUserrating {
    private Integer id;

    private Integer uid;

    private Date ratingtime;

    private String ratingcontent;

    private Integer housedetid;

    private Integer jurisdictionid;

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

    public Date getRatingtime() {
        return ratingtime;
    }

    public void setRatingtime(Date ratingtime) {
        this.ratingtime = ratingtime;
    }

    public String getRatingcontent() {
        return ratingcontent;
    }

    public void setRatingcontent(String ratingcontent) {
        this.ratingcontent = ratingcontent == null ? null : ratingcontent.trim();
    }

    public Integer getHousedetid() {
        return housedetid;
    }

    public void setHousedetid(Integer housedetid) {
        this.housedetid = housedetid;
    }

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }
}