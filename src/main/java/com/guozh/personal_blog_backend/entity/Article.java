package com.guozh.personal_blog_backend.entity;

import java.sql.Timestamp;

public class Article {
    private Integer id;
    private String author;
    private String title;
    private Timestamp createTime;

    public Article() {
    }

    public Article(Integer id, String author, String title, Timestamp createTime) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.createTime = createTime;
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
