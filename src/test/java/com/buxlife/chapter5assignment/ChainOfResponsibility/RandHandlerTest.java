package com.buxlife.chapter5assignment.ChainOfResponsibility;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class RandHandlerTest {

    @Test
    public void testHandler(){
        //Generic Handler test, would apply to all handlers, with necessary associated perimeters.
        MoneyHandler randHandler = new RandHandler();
        MoneyHandler dollarHandler = new DollarHandler();
        randHandler.setSuccessor(dollarHandler);
        randHandler.handleRequest(MoneyEnum.Dollar);

        Assert.assertSame(dollarHandler.getClass(), randHandler.getSuccessor().getClass());
    }

}