package com.buxlife.chapter5assignment.Singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/01.
 */
public class CalculatorTest {
    @Before
    public void setUp() throws Exception {
    }
    @org.junit.Test
    public void testInstance() throws Exception {
        Calculator calculator = Calculator.getInstance();
        Assert.assertNotNull(calculator);
    }

    @Test   //Failing test, test is made to fail.
    public void testDifferentInstances() throws Exception{
        /*This test should always fail, as the singleton pattern
        * defines that there only be one instance of a class at a time,
        * it will be impossible to create a new instance.
        * should this test pass, Singleton has been violated.*/

        Calculator calculator = Calculator.getInstance();
        Calculator newCalculator = Calculator.getInstance();
        //Assert.assertNotSame(calculator, newCalculator);
        //The Above code is the purpose of this test. remove comment to enable.
    }
    @Test
    public void testMultipleInstance() throws Exception{
        Calculator calculator = Calculator.getInstance();
        Calculator calculator1 = Calculator.getInstance();
        Assert.assertSame(calculator, calculator1);

    }
    @org.junit.Test
    public void add() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.add(12, 24));
        Assert.assertEquals(36, calculator.add(12,24));
    }

    @org.junit.Test
    public void subtract() throws Exception {
        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.subtract(18, 16));
        Assert.assertEquals(2, calculator.subtract(18,16));
    }

}