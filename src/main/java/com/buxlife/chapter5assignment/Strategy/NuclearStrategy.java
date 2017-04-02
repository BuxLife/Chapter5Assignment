package com.buxlife.chapter5assignment.Strategy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class NuclearStrategy implements Strategy{

    public boolean checkArea(int enemies) {
        if (enemies > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
