package com.guozh.personal_blog_backend.dao;

import com.guozh.personal_blog_backend.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
@Mapper
public interface CategoryDao {

    public List<Category> listAll();

    public int add(Category category);

    public int deleteById(Integer id);

    public int update(Category category);

    public Category findByName(@Param("name") String name);
}
