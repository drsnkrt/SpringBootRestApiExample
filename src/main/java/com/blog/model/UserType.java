package com.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "usertype")
public class UserType {

    @Id
    private int id;
    private String type;

    public UserType() {
    }

    public UserType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
