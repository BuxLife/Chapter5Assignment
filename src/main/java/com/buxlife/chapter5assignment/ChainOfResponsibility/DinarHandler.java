package com.buxlife.chapter5assignment.ChainOfResponsibility;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DinarHandler extends MoneyHandler{
    @Override
    public void handleRequest(MoneyEnum request) {
        if (request == MoneyEnum.Dinar)
        {
            System.out.println("DinarHandler handles " + request);
            System.out.println("Currency of: Algeria, Bahrain, Iraq, Jordan, Kuwait, Libya, Macedonia, Serbia and Tunisia.\n");
        }
        else{
            System.out.println("DinarHandler doesn't handle " + request);
            if (successor != null){
                successor.handleRequest(request);
            }
        }
    }
}
