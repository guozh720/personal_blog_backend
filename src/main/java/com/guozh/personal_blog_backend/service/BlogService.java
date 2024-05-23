package com.guozh.personal_blog_backend.service;

import com.guozh.personal_blog_backend.dao.BlogDao;
import com.guozh.personal_blog_backend.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogDao blogDao;

    @Autowired
    public BlogService(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public int add(String blogTitle, String blogContent, String coverImage) {
        return blogDao.add(new Blog(blogTitle, blogContent, coverImage));
    }

    public List<Blog> listAll() {
        return blogDao.listAll();
    }
}
