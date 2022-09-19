package com.example.uims.model;

public class BankAccount {
    int accId;
    String accNumber;
    String expDate;
    int userId;

    public BankAccount(int accId, String accNumber, String expDate, int userId) {
        this.accId = accId;
        this.accNumber = accNumber;
        this.expDate = expDate;
        this.userId = userId;
    }

    public BankAccount(String accNumber, String expDate, int userId) {
        this.accNumber = accNumber;
        this.expDate = expDate;
        this.userId = userId;
    }

    public int getAccId() {
        return accId;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accId=" + accId +
                ", accNumber='" + accNumber + '\'' +
                ", expDate='" + expDate + '\'' +
                ", userId=" + userId +
                '}';
    }
}
