package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoChainOfResponsibility {

    public static void main(String[] args){
        MoneyHandler currencyChain = setUpChain();

        currencyChain.handleRequest(MoneyEnum.Dollar);
        currencyChain.handleRequest(MoneyEnum.Rand);
        currencyChain.handleRequest(MoneyEnum.Franc);
        currencyChain.handleRequest(MoneyEnum.Dinar);
        currencyChain.handleRequest(MoneyEnum.Euro);

    }

    public static MoneyHandler setUpChain(){
        MoneyHandler randHandler = new RandHandler();
        MoneyHandler dollarHandler = new DollarHandler();
        MoneyHandler francHandler = new FrancHandler();
        MoneyHandler dinarHandler = new DinarHandler();
        MoneyHandler euroHandler = new EuroHandler();

        randHandler.setSuccessor(dollarHandler);
        dollarHandler.setSuccessor(francHandler);
        francHandler.setSuccessor(dinarHandler);
        dinarHandler.setSuccessor(euroHandler);

        return randHandler;
    }
}
