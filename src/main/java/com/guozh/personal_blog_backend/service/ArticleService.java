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
}
