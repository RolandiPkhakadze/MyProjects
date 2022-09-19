package com.example.uims.model;

public class Deport {
    int id;
    String description;
    int migId;

    public Deport(int id, String description, int migId) {
        this.id = id;
        this.description = description;
        this.migId = migId;
    }

    public Deport(String description, int migId) {
        this.description = description;
        this.migId = migId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getMigId() {
        return migId;
    }

    @Override
    public String toString() {
        return "Deport{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", migId=" + migId +
                '}';
    }
}
