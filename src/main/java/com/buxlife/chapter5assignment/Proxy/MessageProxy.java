package com.buxlife.chapter5assignment.Proxy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageProxy implements Message {

    private TrueMessage realMessage;

    private String message;

    public MessageProxy(String msg){
        this.message = msg;
    }
    public void showMessage() {

        if (realMessage == null) {
            //Create & Show Message only when it is required.
            realMessage = new TrueMessage(message);
        }
        realMessage.showMessage();
    }

    public String toString(){
        return message;
    }
}
