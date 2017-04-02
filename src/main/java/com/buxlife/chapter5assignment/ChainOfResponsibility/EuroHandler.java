package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class EuroHandler extends MoneyHandler{

    @Override
    public void handleRequest(MoneyEnum request) {
        if (request == MoneyEnum.Euro)
        {
            System.out.println("EuroHandler handles " + request);
            System.out.println("Official Currency of the Eurozone.\n");
        }
        else{
            System.out.println("EuroHandler doesn't handle " + request);
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
