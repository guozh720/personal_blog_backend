package com.guozh.personal_blog_backend.dao;

import com.guozh.personal_blog_backend.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleDao {

    List<Article> listAll();

    boolean addArticle(Article article);
}
