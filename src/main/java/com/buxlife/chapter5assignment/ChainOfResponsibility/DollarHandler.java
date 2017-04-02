package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DollarHandler extends MoneyHandler {

    @Override
    public void handleRequest(MoneyEnum request) {
        if (request == MoneyEnum.Dollar)
        {
            System.out.println("DollarHandler handles " + request);
            System.out.println("U.S Currency\n");
        }
        else{
            System.out.println("DollarHandler doesn't handle " + request);
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
