package com.guozh.personal_blog_backend.entity;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public class Category {
    private Integer id;
    private String name;
    private String aliasName;
    private String description;

    public Category() {
    }

    public Category(Integer id, String name, String aliasName, String description) {
        this.id = id;
        this.name = name;
        this.aliasName = aliasName;
        this.description = description;
    }

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
        this.name = name;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
