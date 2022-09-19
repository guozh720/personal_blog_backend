package com.guozh.personal_blog_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String entrance() {
        return "hello SpringBoot";
    }

    @RequestMapping("/test")
    public String sayHello() {
        return "hello test url";
    }


}
