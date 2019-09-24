package com.blog.repository.dao;

import com.blog.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Article Dao with JpaRepository
 * */

@Repository
public interface ArticleDao extends JpaRepository<Article, Integer> {

    Article findById(int id);

}
