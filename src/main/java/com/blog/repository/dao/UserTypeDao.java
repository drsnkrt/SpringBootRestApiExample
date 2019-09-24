package com.blog.repository.dao;

import com.blog.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserTypeDao with JpaRepository
 * */
@Repository
public interface UserTypeDao extends JpaRepository<UserType, Integer> {

}
