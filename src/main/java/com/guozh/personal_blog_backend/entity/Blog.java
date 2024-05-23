package com.guozh.personal_blog_backend.entity;

import java.sql.Timestamp;

public class Blog {
    private Integer id;
    private String blogTitle;
    private String blogContent;
    private int blogStatus = 1;
    private String coverImage;
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());
    private Timestamp updateTime = new Timestamp(System.currentTimeMillis());

    public Blog(String blogTitle, String blogContent, String coverImage) {
        this.blogTitle = blogTitle;
        this.blogContent = blogContent;
        this.coverImage = coverImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public int getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(int blogStatus) {
        this.blogStatus = blogStatus;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
