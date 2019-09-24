package com.blog.repository.dao;

import com.blog.model.Article;
import com.blog.model.Comment;
import com.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CommentDao with JpaRepository
 * */
@Repository
public interface CommentDao extends JpaRepository<Comment, Integer> {

}
