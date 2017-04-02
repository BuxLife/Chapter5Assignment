package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class RandHandler extends MoneyHandler {

    @Override
    public void handleRequest(MoneyEnum request) {
        if (request == MoneyEnum.Rand)
        {
            System.out.println("RandHandler handles " + request);
            System.out.println("South African Currency\n");
        }
        else{
            System.out.println("RandHandler doesn't handle " + request);
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
