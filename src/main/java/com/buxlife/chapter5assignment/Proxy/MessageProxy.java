package com.buxlife.chapter5assignment.Proxy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageProxy implements Message {

    private String message;
    private String proxyMessage;

    public MessageProxy(String msg){
        this.message = msg;
    }
    public void showMessage() {

        //Create & Show Message only when it is required.
        proxyMessage = new String(message);
        System.out.println(proxyMessage.toString());

    }
}
