package com.example.uims.model;

public class Transaction {
    int transId;
    int fromAccId;
    int toAccId;
    int amount;
    String description;

    public Transaction(int transId, int fromAccId, int toAccId, int amount, String description) {
        this.transId = transId;
        this.fromAccId = fromAccId;
        this.toAccId = toAccId;
        this.amount = amount;
        this.description = description;
    }

    public Transaction(int fromAccId, int toAccId, int amount, String description) {
        this.fromAccId = fromAccId;
        this.toAccId = toAccId;
        this.amount = amount;
        this.description = description;
    }

    public int getTransId() {
        return transId;
    }

    public int getFromAccId() {
        return fromAccId;
    }

    public int getToAccId() {
        return toAccId;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transId=" + transId +
                ", fromAccId=" + fromAccId +
                ", toAccId=" + toAccId +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
