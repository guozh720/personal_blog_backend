package com.guozh.personal_blog_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String entrance() {
        String msg = "hello SpringBoot";
        return msg;
    }

    @RequestMapping("/test")
    public String sayHello() {
        String msg = "hello test url";
        return msg;
    }


}
