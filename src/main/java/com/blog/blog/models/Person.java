package com.blog.blog.models;

public class Person {

    // ===== object props ====== \\
    private String state;
    private String income;
    private long id;

    public Person(){

    }


    // ===== Getters & Setters ===== \\
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
