package com.buxlife.chapter5assignment.Strategy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class FrontalAttackStrategy implements Strategy {

    public boolean checkArea(int enemies) {
        if ((enemies >= 0) && (enemies <= 10))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
