package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.entity.Article;
import com.guozh.personal_blog_backend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("article")
@CrossOrigin
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/listAll")
    public List<Article> listAll() {
        return articleService.listAll();
    }
}
