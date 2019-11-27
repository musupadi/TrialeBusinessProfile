package com.destinyapp.e_businessprofile.Model;

public class Message {
    String message;
    String name;
    String email;
    String tgl;
    String key;

    public Message(){

    }
    public Message(String message, String name,String email,String tgl){
        this.message=message;
        this.name=name;
        this.email=email;
        this.tgl=tgl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString(){
        return "Message("+
                "message='"+message+'\''+
                ", name='"+name+'\''+
                ", email='"+email+'\''+
                ", tgl='"+tgl+'\''+
                ", key='"+key+'\''+
                ')';
    }
}
