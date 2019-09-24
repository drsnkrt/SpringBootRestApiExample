package com.blog.repository.service;

import com.blog.model.Article;
import com.blog.repository.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Article Operations Service
 * */
@Service
public class ArticleService {


    @Autowired
    private ArticleDao dao;

    public void save(Article article) {
        dao.save(article);
    }

    public List<Article> articleList() {
        return dao.findAll();
    }

    public Article getArticle(int id) {
        return dao.findById(id);
    }


}
