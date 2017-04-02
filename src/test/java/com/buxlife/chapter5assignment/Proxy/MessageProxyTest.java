package com.buxlife.chapter5assignment.Proxy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MessageProxyTest {
    @Test
    public void showMessage() throws Exception {
        Message message = new MessageProxy("Secret");
        message.showMessage();
        Assert.assertEquals("Secret", message.toString());
    }

}