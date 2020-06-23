package com.housedemo.houseapi.entity;

public class THousedetail {
    private Integer id;

    private String img;

    private String housename;

    private Double price;

    private String introduce;

    private String manage;

    private String imgurl;

    private Integer hsid;

    private Double area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename == null ? null : housename.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage == null ? null : manage.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getHsid() {
        return hsid;
    }

    public void setHsid(Integer hsid) {
        this.hsid = hsid;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}