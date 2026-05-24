package com.jpmc.midascore.foundation;

public class Transaction {

    private long senderId;
    private long recipientId;
    private float amount;

    public Transaction() {
    }

    public Transaction(
            long senderId,
            long recipientId,
            float amount) {

        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}