package com.example.uims.model;

public class HealthCare {
    int hcId;
    String hospital;
    String date;
    String description;
    int userId;

    public HealthCare(int hcId, String hospital, String date, String description, int userId) {
        this.hcId = hcId;
        this.hospital = hospital;
        this.date = date;
        this.description = description;
        this.userId = userId;
    }

    public HealthCare(String hospital, String date, String description, int userId) {
        this.hospital = hospital;
        this.date = date;
        this.description = description;
        this.userId = userId;
    }

    public int getHcId() {
        return hcId;
    }

    public String getHospital() {
        return hospital;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "HealthCare{" +
                "hcId=" + hcId +
                ", hospital='" + hospital + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
