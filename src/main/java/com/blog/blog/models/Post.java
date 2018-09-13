package com.blog.blog.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;


    // ===== relationships ===== \\

    @ManyToOne
//    @JoinColumn(name = "user_id")
    private User user;



    // ===== constructors ===== \\

    public Post(){

    }

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, User user, long id) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.user = user;
    }

    public Post(String title, String body, long id){
        this.title = title;
        this.body = body;
        this.id = id;
    }

    // ===== Getters & Setters + Override toString method ===== \\

    @Override
    public String toString(){
        return String.format("ID: %d, TITLE: %s, BODY: %s, POSTED BY: %s", id, title, body);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
