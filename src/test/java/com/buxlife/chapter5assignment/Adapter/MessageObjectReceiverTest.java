package com.buxlife.chapter5assignment.Adapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageObjectReceiverTest {

    @Test
    public void testClassReceiver() throws Exception {
        //Example of Object Adapter, implements composition
        System.out.println("\nObject Adapter Test");
        MessageInfo objectMessageInfo = new MessageObjectReceiver();
        objectMessageInfo.setMessage("Join now and get your free soap!!");
        objectMessageInfo.setSender("The Rebel Alliance");

        System.out.println("Message: " + objectMessageInfo.getMessage());
        System.out.println("Sender: " + objectMessageInfo.getSender());

        Assert.assertEquals(objectMessageInfo.getClass(), MessageObjectReceiver.class);
    }

    @Test
    public void testGetMessage(){
        System.out.println("\nObject Adapter Test");
        MessageInfo objectMessageInfo = new MessageObjectReceiver();
        objectMessageInfo.setMessage("Join now and get your free soap!!");
        objectMessageInfo.setSender("The Rebel Alliance");

        Assert.assertEquals(objectMessageInfo.getMessage(), "Join now and get your free soap!!");

    }

    @Test
    public void testGetSender(){
        System.out.println("\nObject Adapter Test");
        MessageInfo objectMessageInfo = new MessageObjectReceiver();
        objectMessageInfo.setMessage("Join now and get your free soap!!");
        objectMessageInfo.setSender("The Rebel Alliance");


        Assert.assertEquals(objectMessageInfo.getSender(), "The Rebel Alliance");

    }

}