package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.entity.Article;
import com.guozh.personal_blog_backend.enums.ErrorEnum;
import com.guozh.personal_blog_backend.service.ArticleService;
import com.guozh.personal_blog_backend.utils.FailureResultDO;
import com.guozh.personal_blog_backend.utils.ServiceResultDO;
import com.guozh.personal_blog_backend.utils.SuccessResultDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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

    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public ServiceResultDO listAll() {
        return new SuccessResultDO(articleService.listAll());
    }

@RequestMapping(value = "/add",method = RequestMethod.POST)
public ServiceResultDO addArticle(@RequestBody Map map) {
    System.out.println(map.get("content"));
    boolean booleanInsert = articleService.addArticle("author", "title");
    if (!booleanInsert) {
        return new FailureResultDO(ErrorEnum.UniqueKeyIsExist);
    } else {
        return new SuccessResultDO();
    }
}
}
