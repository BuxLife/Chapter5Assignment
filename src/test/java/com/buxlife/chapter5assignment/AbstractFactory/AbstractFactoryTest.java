package com.buxlife.chapter5assignment.AbstractFactory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() throws Exception {
        AbstractFactory abstractFactory = new AbstractFactory();
        //Abstract factory creates a hero factory. this tests to see if hero factory object is equal to object of class Knight
        Assert.assertEquals(abstractFactory.getHeroFactory("Strength").getClass(), StrengthFactory.class);
    }

    @Test
    public void testStrengthHero() throws Exception{
        //Tests that a new instance of Knight is created when getHero is called.
        AbstractFactory abstractFactory = new AbstractFactory();
        Knight knight = new Knight();
        HeroFactory altarOfStrength = abstractFactory.getHeroFactory("Strength");
        Assert.assertNotSame(altarOfStrength.getHero("Knight"), knight);
        //Asserts that the knight called in getHero() is not the same object as the second knight

    }

}