package com.housedemo.houseapi.entity;

import java.util.Date;

public class TPremises {
    private Integer id;

    private String name;

    private String dynamic;

    private Integer hyid;

    private String imageurl;

    private String rim;

    private String traffic;

    private String address;

    private Integer hid;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDynamic() {
        return dynamic;
    }

    public void setDynamic(String dynamic) {
        this.dynamic = dynamic == null ? null : dynamic.trim();
    }

    public Integer getHyid() {
        return hyid;
    }

    public void setHyid(Integer hyid) {
        this.hyid = hyid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getRim() {
        return rim;
    }

    public void setRim(String rim) {
        this.rim = rim == null ? null : rim.trim();
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}