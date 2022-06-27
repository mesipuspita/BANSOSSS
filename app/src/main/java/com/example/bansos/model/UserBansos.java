package com.example.bansos.model;

public class UserBansos {
    private  String name;
    private String email;
    private String hp;

    public UserBansos(){

    }

    public UserBansos(String name, String email, String hp) {
        this.name = name;
        this.email = email;
        this.hp = hp;
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

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }
}
