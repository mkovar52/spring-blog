package com.blog.blog.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private String userEmail;


    // ===== constructors ===== \\
    public Post(){

    }

    public Post(String title, String body, long postId){
        this.title = title;
        this.body = body;
        this.postId = postId;
    }

    public Post(String title, String body, long postId, String userEmail){
        this.title = title;
        this.body = body;
        this.postId = postId;
        this.userEmail = userEmail;
    }

    public Post(String title, String body, String userEmail){
        this.title = title;
        this.body = body;
        this.userEmail = userEmail;
    }

    public Post(long postId){
        this.postId = postId;
    }


    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    // ===== Getters & Setters + Override toString method ===== \\

    @Override
    public String toString(){
        return String.format("ID: %d, TITLE: %s, BODY: %s, POSTED BY: %s", postId, title, body, userEmail);
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

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getUserEmail(){ return userEmail; }

    public void setUserEmail(String userEmail){this.userEmail = userEmail;}
}
