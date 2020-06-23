package com.housedemo.houseapi.entity;

public class TArticle {
    private Integer id;

    private String title;

    private String content;

    private String imgurl;

    private String fieldc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getFieldc() {
        return fieldc;
    }

    public void setFieldc(String fieldc) {
        this.fieldc = fieldc == null ? null : fieldc.trim();
    }
}