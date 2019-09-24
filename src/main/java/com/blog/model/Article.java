package com.blog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String article;
    private String imageUri;
    private Date recordDate;
    private int recordStatus;

    public Article(String title, String article, String imageUri, Date recordDate,int recordStatus) {
        this.title = title;
        this.article = article;
        this.imageUri = imageUri;
        this.recordDate = recordDate;
        this.recordStatus = recordStatus;
    }

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public int getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }
}
