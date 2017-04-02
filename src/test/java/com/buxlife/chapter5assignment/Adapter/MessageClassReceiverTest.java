package com.buxlife.chapter5assignment.Adapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageClassReceiverTest {
    @Test
    public void testClassReciever() throws Exception {

        //Example of Class Adapter, implements inheritance
        System.out.println("Class Adapter Test");
        MessageInfo classMessageInfo = new MessageClassReceiver();
        classMessageInfo.setMessage("Join now for a free SHAMPOO and CONDITIONER combo!");
        classMessageInfo.setSender("The Empire");

        System.out.println("Message: " + classMessageInfo.getMessage());
        System.out.println("Sender: " + classMessageInfo.getSender());

        Assert.assertNotEquals(classMessageInfo.getClass(), MessageInfo.class);
        Assert.assertEquals(classMessageInfo.getClass(), MessageClassReceiver.class);
    }
}