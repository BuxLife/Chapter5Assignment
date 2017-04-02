package com.buxlife.chapter5assignment.Strategy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoStrategy {

    public static void main(String[] args){
        int numEnemies = 60;

        Strategy frontalAssault = new FrontalAttackStrategy();
        Strategy infiltrationStrategy = new InfiltrationStrategy();
        Strategy boomBoom = new NuclearStrategy();
        Context context = new Context(numEnemies, frontalAssault);

        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Frontal Attack possible: " + context.getResult());

        System.out.println("Reinforcements!!!");
        context.setStrategy(infiltrationStrategy);
        context.setNumEnemies(80);
        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Infiltration possible: " + context.getResult());

        context.setNumEnemies(120);
        context.setStrategy((boomBoom));
        System.out.println("Number of Enemies: " + context.getNumEnemies());
        System.out.println("Nuclear Attack possible: " + context.getResult());

    }
}
