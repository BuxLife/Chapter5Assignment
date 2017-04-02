package com.buxlife.chapter5assignment.Adapter;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageClassReceiver extends MessageDelivery implements MessageInfo{
//This Class implements inheritance
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getSender() {
        return super.getSender();
    }

    @Override
    public void setSender(String sender) {
        super.setSender(sender);
    }

    @Override
    public void setMessage(String message) {
        super.setMessage(message);
    }
}
