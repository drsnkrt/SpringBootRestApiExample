package com.blog.repository.service;

import com.blog.model.UserType;
import com.blog.repository.dao.UserTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserType Operations Service
 * */
@Service
public class UserTypeService {


    @Autowired
    private UserTypeDao dao;

    public void save(UserType userType) {
        dao.save(userType);
    }

    public List<UserType> userTypes() {
        return dao.findAll();
    }


}
