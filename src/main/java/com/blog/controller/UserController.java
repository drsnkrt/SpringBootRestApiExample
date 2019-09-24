package com.blog.controller;


import com.blog.model.User;
import com.blog.repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Rest Controller for User Api
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public List<User> getAllArticles() {
        return userService.getAllUsers();
    }

    @PostMapping("saveuser")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping(value = "{id}")
    public User getLogsByExecutionId(@PathVariable("id") final int id) {
        return userService.getUser(id);
    }

}
