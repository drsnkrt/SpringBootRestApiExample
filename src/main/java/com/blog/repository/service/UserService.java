package com.blog.repository.service;

import com.blog.model.User;
import com.blog.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User Operations Service
 * */
@Service
public class UserService {


    @Autowired
    private UserDao dao;

    public void save(User user) {
        dao.save(user);
    }

    public List<User> getAllUsers() {
        return dao.findAll();
    }

    public User getUser(int id) {

        return dao.findById(id);
    }


}
