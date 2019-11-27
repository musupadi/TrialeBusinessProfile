package com.destinyapp.e_businessprofile.SharedPreferance;

public class User {
    private String username;
    private String person;
    private String id;
    public User(){

    }
    public User(String username, String person,String id){
        this.username=username;
        this.person=person;
        this.id=id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}