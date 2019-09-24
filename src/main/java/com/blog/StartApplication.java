package com.blog;

import com.blog.model.Article;
import com.blog.model.Comment;
import com.blog.model.User;
import com.blog.model.UserType;
import com.blog.repository.service.ArticleService;
import com.blog.repository.service.CommentService;
import com.blog.repository.service.UserService;
import com.blog.repository.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Date;


/**
 * Project starter Class
 * Create new Articles Users and UserTypes
 */
@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    UserService userService;
    @Autowired
    UserTypeService userTypeService;
    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {

        UserType ut1 = new UserType(1, "Admin");
        UserType ut2 = new UserType(2, "Sefil");
        userTypeService.save(ut1);
        userTypeService.save(ut2);

        User admin = new User("drsnkrt", "123123", "url", userTypeService.userTypes().get(0));
        User sefil = new User("sefil", "123123", "url", userTypeService.userTypes().get(1));
        userService.save(admin);
        userService.save(sefil);

        System.out.println("*****************************" + userService.getAllUsers().get(0).getId() + " " + userService.getAllUsers().get(0).getUserName() + " " + userService.getAllUsers().get(0).getUserType().getType());

        Article article = new Article("Başlık", "250 karakterlik bir yazı", "image", new Date(), 1);
        articleService.save(article);

        commentService.save(new Comment("comment1", 2, new Date(), articleService.articleList().get(0)));
        commentService.save(new Comment("comment2", 2, new Date(), articleService.articleList().get(0)));
        commentService.save(new Comment("comment3", 2, new Date(), articleService.articleList().get(0)));

    }
}

