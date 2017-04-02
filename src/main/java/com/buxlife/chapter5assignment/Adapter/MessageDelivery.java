package com.buxlife.chapter5assignment.Adapter;
/*
    Author: Naeem Bux       Filename: MessageDelivery.java
    File Description:       A class implementing the Adapter Design Pattern,
                            a Structural Design Pattern.
 */
public class MessageDelivery {

    private String message;
    private String sender;

    public MessageDelivery(){}

    public MessageDelivery(String message, String sender){
        setMessage(message);
        setSender(sender);
    }
    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
