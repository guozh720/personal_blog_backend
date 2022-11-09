package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.entity.Article;
import com.guozh.personal_blog_backend.enums.ErrorEnum;
import com.guozh.personal_blog_backend.service.ArticleService;
import com.guozh.personal_blog_backend.utils.FailureResultDO;
import com.guozh.personal_blog_backend.utils.ServiceResultDO;
import com.guozh.personal_blog_backend.utils.SuccessResultDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ServiceResultDO listAll() {
        return new SuccessResultDO(articleService.listAll());
    }

    @PostMapping("/add")
    public ServiceResultDO addArticle() {
        String author = "郭大大";
        String title = "id";
        boolean booleanInsert = articleService.addArticle(author, title);
        if (!booleanInsert) {
            return new FailureResultDO(ErrorEnum.UniqueKeyIsExist);
        } else {
            return new SuccessResultDO();
        }
    }
}
