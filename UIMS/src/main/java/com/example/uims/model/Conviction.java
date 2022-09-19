package com.example.uims.model;

public class Conviction {
    int convId;
    String description;
    int userId;

    public Conviction(int convId, String description, int userId) {
        this.convId = convId;
        this.description = description;
        this.userId = userId;
    }

    public Conviction(String description, int userId) {
        this.description = description;
        this.userId = userId;
    }

    public int getConvId() {
        return convId;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Conviction{" +
                "convId=" + convId +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
