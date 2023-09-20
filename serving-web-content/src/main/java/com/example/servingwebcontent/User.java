package com.example.servingwebcontent;
public class User {
    public Integer userId;
    public Integer id;
    public String title;
    public Boolean completed;

    public Integer getuserId() {
        return userId;
    }
    public void setuserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public Boolean getcompleted() {
        return completed;
    }
    public void setcompleted(boolean completed) {
        this.completed = completed;
    }
}