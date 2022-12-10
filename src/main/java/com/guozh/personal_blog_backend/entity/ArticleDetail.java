package com.guozh.personal_blog_backend.entity;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
public class ArticleDetail {
    private Integer id;
    private Integer articleId;
    private String content;

    public ArticleDetail() {
    }

    public ArticleDetail(Integer articleId, String content) {
        this.articleId = articleId;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
