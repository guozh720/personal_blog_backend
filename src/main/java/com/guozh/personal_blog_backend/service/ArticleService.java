package com.guozh.personal_blog_backend.service;

import com.guozh.personal_blog_backend.dao.ArticleDao;
import com.guozh.personal_blog_backend.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ArticleService")
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public List<Article> listAll() {
        return articleDao.listAll();
    }

    public int addArticle(String author, String title) {
        Article article = new Article(author, title);
        articleDao.addArticle(article);
        return article.getId();
    }
}
