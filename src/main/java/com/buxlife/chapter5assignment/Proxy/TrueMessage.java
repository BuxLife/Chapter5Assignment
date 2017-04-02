package com.buxlife.chapter5assignment.Proxy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class TrueMessage implements Message {

    public String message;

    public TrueMessage(String message){
        this.message = message;
    }
    public void showMessage() {
        System.out.println("Message Details: " + message);
    }



}

