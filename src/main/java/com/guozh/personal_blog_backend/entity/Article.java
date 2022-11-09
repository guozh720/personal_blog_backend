package com.guozh.personal_blog_backend.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Article {
    private Integer id;
    private String author;
    private String title;
    private Timestamp createTime;

    public Article() {
    }

    public Article( String author, String title) {
        this.author = author;
        this.title = title;
        this.createTime = new Timestamp(System.currentTimeMillis());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
