package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.entity.Article;
import com.guozh.personal_blog_backend.service.ArticleService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("article")
@CrossOrigin(
        origins = "*",
        methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS},
        allowedHeaders = "*"
)
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/listAll")
    public List<Article> listAll() {
        return articleService.listAll();
    }
}
