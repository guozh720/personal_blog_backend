package com.guozh.personal_blog_backend.dao;

import com.guozh.personal_blog_backend.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogDao {
    
    List<Blog> listAll();
    
    int add(Blog blog);
    
    int update(Blog blog);
    
    int deleteById(Integer id);
}
