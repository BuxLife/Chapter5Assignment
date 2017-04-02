package com.buxlife.chapter5assignment.Adapter;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageObjectReceiver implements MessageInfo{
//This class implements Composition.

    MessageDelivery messageDelivery;

    public MessageObjectReceiver(){
        messageDelivery = new MessageDelivery();
    }

    public void setMessage(String msg) {
        messageDelivery.setMessage(msg);
    }

    public void setSender(String sender) {
        messageDelivery.setSender(sender);
    }

    public String getSender() {
        return messageDelivery.getSender();
    }

    public String getMessage() {
        return messageDelivery.getMessage();
    }
}
