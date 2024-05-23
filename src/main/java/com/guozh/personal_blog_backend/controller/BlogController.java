package com.guozh.personal_blog_backend.controller;

import com.guozh.personal_blog_backend.entity.Blog;
import com.guozh.personal_blog_backend.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blog")
@CrossOrigin(
        origins = "*",
        methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS},
        allowedHeaders = "*"
)
public class BlogController {
    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }


    @GetMapping("/listAll")
    public List<Blog> listAll() {
        return blogService.listAll();
    }

    @PostMapping("/add")
    public int add(String blogTitle, String blogContent, String coverImage) {
        logger.info("method: [{}] , current msg: [{}, {}, {}]", "add", blogTitle, blogContent, coverImage);
        return blogService.add(blogTitle, blogContent, coverImage);
    }
}
