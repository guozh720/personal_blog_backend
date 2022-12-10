package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.enums.ErrorEnum;
import com.guozh.personal_blog_backend.service.ArticleDetailService;
import com.guozh.personal_blog_backend.service.ArticleService;
import com.guozh.personal_blog_backend.utils.FailureResultDO;
import com.guozh.personal_blog_backend.utils.ServiceResultDO;
import com.guozh.personal_blog_backend.utils.SuccessResultDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private ArticleDetailService articleDetailService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public ServiceResultDO listAll() {
        return new SuccessResultDO(articleService.listAll());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResultDO addArticle(@RequestBody Map map) {
        String content = (String) map.get("content");
        String author = (String) map.get("author");
        String title = (String) map.get("title");
        int articleId = articleService.addArticle(author, title);
        int articleDetailId = articleDetailService.addArticleDetail(articleId, content);
        if (articleDetailId == 0) {
            return new FailureResultDO(ErrorEnum.UniqueKeyIsExist);
        } else {
            return new SuccessResultDO(articleDetailId);
        }
    }
}
