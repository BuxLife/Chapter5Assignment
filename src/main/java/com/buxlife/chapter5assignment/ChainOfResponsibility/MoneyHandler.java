package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public abstract class MoneyHandler {
    MoneyHandler successor;

    public void setSuccessor(MoneyHandler successor){
        this.successor = successor;
    }

    public MoneyHandler getSuccessor() {
        return successor;
    }

    public abstract void handleRequest(MoneyEnum request);
}
