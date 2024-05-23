package com.guozh.personal_blog_backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/")
    public String entrance() {
        logger.info("method:[]","/");
        return "hello SpringBoot";
    }

    @RequestMapping("/test")
    public String sayHello() {
        logger.info("method:[]","/test");
        return "hello test url";
    }


}
