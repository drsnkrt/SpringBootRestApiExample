package com.blog.controller;


import com.blog.model.Article;
import com.blog.repository.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest Controller for Articles Api and index
 */
@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("articles")
    public List<Article> getAllArticles() {
        return articleService.articleList();
    }

    @PostMapping("savearticle")
    public void save(@RequestBody Article article) {
        articleService.save(article);
    }


    @RequestMapping(value = "/")
    public String index() {
        return "Spring Boot Rest Api example";
    }

}
