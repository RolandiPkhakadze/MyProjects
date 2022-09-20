package com.example.uims.model;

import com.example.uims.enums.Type;

public class User {
    private int userId;
    private final String personalId;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final Type type;
    private final String password;

    public User(int userId, String personalId, String firstName, String lastName, String address, Type type, String password) {
        this.userId = userId;
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.type = type;
        this.password = password;
    }

    public User(String personalId, String firstName, String lastName, String address, Type type, String password) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.type = type;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getPersonalId() {
        return personalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type.getUserType();
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", personalId='" + personalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
