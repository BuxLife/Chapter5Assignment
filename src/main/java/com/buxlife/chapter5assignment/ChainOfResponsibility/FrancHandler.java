package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class FrancHandler extends MoneyHandler {

    @Override
    public void handleRequest(MoneyEnum request) {
        if (request == MoneyEnum.Franc)
        {
            System.out.println("FrancHandler handles " + request);
            System.out.println("Swedish Currency\n");
        }
        else{
            System.out.println("FrancHandler doesn't handle " + request);
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
