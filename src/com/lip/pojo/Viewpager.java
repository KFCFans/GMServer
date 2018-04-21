package com.lip.pojo;

public class Viewpager {
    private Integer vid;

    private String url;

    private String nexturl;

    private String title;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getNexturl() {
        return nexturl;
    }

    public void setNexturl(String nexturl) {
        this.nexturl = nexturl == null ? null : nexturl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}