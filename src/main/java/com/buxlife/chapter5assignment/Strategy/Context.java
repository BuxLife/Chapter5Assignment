package com.buxlife.chapter5assignment.Strategy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Context {
    int numEnemies;
    Strategy strategy;

    public Context(int numEnemies, Strategy strategy)
    {
        this.numEnemies = numEnemies;
        this.strategy  = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getNumEnemies() {
        return numEnemies;
    }

    public void setNumEnemies(int numEnemies) {
        this.numEnemies = numEnemies;
    }

    public boolean getResult() {
        return strategy.checkArea(numEnemies);
    }
}
