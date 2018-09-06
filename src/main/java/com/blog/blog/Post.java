package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


public class Post {

    private String userEmail;
    private String userDateOfBirth;
    private int userAge;
    private long userIdNum;

    public String title;
    public String body;

    public Post(){

    }

    public Post(String title, String body, long userIdNum){
        this.title = title;
        this.body = body;
        this.userIdNum = userIdNum;
    }



    public Post(String userEmail, String userDateOfBirth, int userAge) {
        this.userEmail = userEmail;
        this.userDateOfBirth = userDateOfBirth;
        this.userAge = userAge;
    }

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(String userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
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
}
