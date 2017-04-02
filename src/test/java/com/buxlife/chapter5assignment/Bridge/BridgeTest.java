package com.buxlife.chapter5assignment.Bridge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class BridgeTest {

    @Test
    public void testSlowPC() throws Exception{
        Computer pcI3 = new EntryPC(new I3());
        Computer pcI5 = new EntryPC(new I5());
        Computer pcI7 = new EntryPC(new I7());
        pcI3.startPC();
        pcI5.startPC();
        pcI7.startPC();

        Assert.assertEquals( pcI7.getPowerRating(), 45, 0);
    }
    @Test
    public void testMidPC() throws Exception{
        Computer pcI3 = new MidPC(new I3());
        Computer pcI5 = new MidPC(new I5());
        Computer pcI7 = new MidPC(new I7());
        pcI3.startPC();
        pcI5.startPC();
        pcI7.startPC();

        Assert.assertEquals( pcI7.getPowerRating(), 70, 0);

    }
    @Test
    public void testHighPC() throws Exception{
        Computer pcI3 = new HighPC(new I3());
        Computer pcI5 = new HighPC(new I5());
        Computer pcI7 = new HighPC(new I7());
        pcI3.startPC();
        pcI5.startPC();
        pcI7.startPC();

        Assert.assertEquals( pcI7.getPowerRating(), 120, 0);
    }

}