package com.buxlife.chapter5assignment.Strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class ContextTest {

    int numEnemies = 60;

    @Test
            public void testFrontalAssault() {
        Strategy frontalAssault = new FrontalAttackStrategy();
        Context context = new Context(numEnemies, frontalAssault);

        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Frontal Attack possible: " + context.getResult());

        Assert.assertFalse(context.getResult());

    }
    @Test
            public void testInfiltration(){
        Strategy infiltrationStrategy = new InfiltrationStrategy();
        Context context = new Context(numEnemies, infiltrationStrategy);
        System.out.println("Reinforcements!!!");
        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Infiltration possible: " + context.getResult());

        //Assert.assertTrue(context.getResult());
        Assert.assertFalse(context.getResult());
    }

    @Test
        public void TestNuclearPower(){

        Strategy boomBoom = new NuclearStrategy();
        Context context = new Context(numEnemies, boomBoom);
        context.setNumEnemies(120);
        context.setStrategy((boomBoom));
        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Nuclear Attack possible: " + context.getResult());
        Assert.assertEquals(120, context.getNumEnemies(), 0);
    }


}