package com.guozh.personal_blog_backend.service;

import com.guozh.personal_blog_backend.dao.ArticleDetailDao;
import com.guozh.personal_blog_backend.entity.ArticleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author guozh
 * @Date 2022/12/10
 */
@Service("ArticleDetailService")
public class ArticleDetailService {
    @Autowired
    private ArticleDetailDao articleDetailDao;

    public int addArticleDetail(int articleId, String content) {
        ArticleDetail articleDetail = new ArticleDetail(articleId, content);
        articleDetailDao.addArticleDetail(articleDetail);
        return articleDetail.getId();
    }

}
