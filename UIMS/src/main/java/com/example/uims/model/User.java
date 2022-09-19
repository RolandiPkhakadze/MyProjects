package com.example.uims.model;

public class User {
    private int userId;
    private String personalId;
    private String firstName;
    private String lastName;
    private String address;
    private String type;
    private String password;

    public User(int userId, String personalId, String firstName, String lastName, String address, String type, String password) {
        this.userId = userId;
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.type = type;
        this.password = password;
    }

    public User(String personalId, String firstName, String lastName, String address, String type, String password) {
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
        return type;
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
