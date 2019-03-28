package com.example.mvpimplementation.Model;

public class User {


    private String fullname = "", email = "";

    public User(String fullname, String email){
        this.fullname = fullname;
        this.email = email;
    }

    public User(){

    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getFullname()
    {
        return fullname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString()
    {
        return "Email: " + email + "\nFullName: " + fullname;
    }
}
