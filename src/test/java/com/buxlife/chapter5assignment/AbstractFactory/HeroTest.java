package com.buxlife.chapter5assignment.AbstractFactory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class HeroTest {
    @Test
    public void heroDescription() throws Exception {
        Knight knight = new Knight();
        knight.heroDescription();
    }

    @Test
    public void attack() throws Exception {
        Knight knight = new Knight();
        knight.attack();
        Assert.assertEquals(knight.attack(), 20, 0);
    }

}