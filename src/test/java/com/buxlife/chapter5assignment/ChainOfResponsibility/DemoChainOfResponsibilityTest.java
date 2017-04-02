package com.buxlife.chapter5assignment.ChainOfResponsibility;

import com.buxlife.chapter5assignment.Singleton.DemoSingleton;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoChainOfResponsibilityTest {
    @Test
    public void setUpChain() throws Exception {

        //Tests to see if the next class in the currency chain is the DollarHandler
        MoneyHandler currencyChain = DemoChainOfResponsibility.setUpChain();
        Assert.assertSame(DollarHandler.class, currencyChain.successor.getClass());
    }

}