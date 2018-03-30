package com.lip.pojo;

public class Areainfo {
    private Integer aid;

    private String aplace;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAplace() {
        return aplace;
    }

    public void setAplace(String aplace) {
        this.aplace = aplace == null ? null : aplace.trim();
    }
}