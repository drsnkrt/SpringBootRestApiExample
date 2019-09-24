package com.blog.repository.dao;

import com.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserDao with JpaRepository
 * */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

     User findById(int id) ;
}
