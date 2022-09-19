package com.example.uims.model;

public class Migration {
    int migId;
    String fromCountry;
    String toCountry;
    String date;
    int userId;

    public Migration(int migId, String fromCountry, String toCountry, String date, int userId) {
        this.migId = migId;
        this.fromCountry = fromCountry;
        this.toCountry = toCountry;
        this.date = date;
        this.userId = userId;
    }

    public Migration(String fromCountry, String toCountry, String date, int userId) {
        this.fromCountry = fromCountry;
        this.toCountry = toCountry;
        this.date = date;
        this.userId = userId;
    }

    public int getMigId() {
        return migId;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public String getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Migration{" +
                "migId=" + migId +
                ", fromCountry='" + fromCountry + '\'' +
                ", toCountry='" + toCountry + '\'' +
                ", date='" + date + '\'' +
                ", userId=" + userId +
                '}';
    }
}
