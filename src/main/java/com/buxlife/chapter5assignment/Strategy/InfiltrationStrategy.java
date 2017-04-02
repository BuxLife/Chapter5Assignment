package com.buxlife.chapter5assignment.Strategy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class InfiltrationStrategy implements Strategy {

    public boolean checkArea(int enemies) {
        if ((enemies >= 10) && (enemies <= 50))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
