package com.example.uims.enums;

public enum Type {
    NORMAL("normal"),
    ADMIN("admin");
    private final String userType;
    Type(String userType) {
        this.userType = userType;
    }
     public String getUserType(){
        return userType;
     }
}
