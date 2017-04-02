package com.buxlife.chapter5assignment.Prototyping;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class PrototypeTest {
    @Test
    public void createCopy() throws Exception {

        //Objects to clone
        Person adult = new Person ("Ellen", 24);

        //Clone objects
        Person newAdult = (Person) adult.createCopy();
        /*Each product produces the same result. a copy of the first object but a different object in itself.
        Assert.assertEquals(adult, newAdult); Should fail!*/
        Assert.assertEquals(adult.toString(), newAdult.toString()); //The contents are the same.
    }

}