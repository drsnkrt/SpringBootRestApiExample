package com.blog.repository.service;

import com.blog.model.Comment;
import com.blog.repository.dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Comment Operations Service
 * */
@Service
public class CommentService {


    @Autowired
    private CommentDao dao;

    public void save(Comment comment) {
        dao.save(comment);
    }

    public List<Comment> getAllComments() {
        return dao.findAll();
    }



}
