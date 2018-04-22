package com.lip.pojo;

import java.util.Date;

public class Activityinfo {
    private Integer avid;

    private String avname;

    private String avplace;

    private Date avstime;

    private String avpic;

    private String avdetail;

    private Date avetime;

    private Integer avstatus;

    public Integer getAvid() {
        return avid;
    }

    public void setAvid(Integer avid) {
        this.avid = avid;
    }

    public String getAvname() {
        return avname;
    }

    public void setAvname(String avname) {
        this.avname = avname == null ? null : avname.trim();
    }

    public String getAvplace() {
        return avplace;
    }

    public void setAvplace(String avplace) {
        this.avplace = avplace == null ? null : avplace.trim();
    }

    public Date getAvstime() {
        return avstime;
    }

    public void setAvstime(Date avstime) {
        this.avstime = avstime;
    }

    public String getAvpic() {
        return avpic;
    }

    public void setAvpic(String avpic) {
        this.avpic = avpic == null ? null : avpic.trim();
    }

    public String getAvdetail() {
        return avdetail;
    }

    public void setAvdetail(String avdetail) {
        this.avdetail = avdetail == null ? null : avdetail.trim();
    }

    public Date getAvetime() {
        return avetime;
    }

    public void setAvetime(Date avetime) {
        this.avetime = avetime;
    }

    public Integer getAvstatus() {
        return avstatus;
    }

    public void setAvstatus(Integer avstatus) {
        this.avstatus = avstatus;
    }
}