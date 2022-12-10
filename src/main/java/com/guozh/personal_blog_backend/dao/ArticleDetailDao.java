package com.guozh.personal_blog_backend.dao;

import com.guozh.personal_blog_backend.entity.ArticleDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author guozh
 * @Date 2022/9/20
 */
@Mapper
public interface ArticleDetailDao {

    int addArticleDetail(ArticleDetail articleDetail);
}
