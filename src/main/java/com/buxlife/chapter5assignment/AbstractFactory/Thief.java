package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Thief extends Hero{
    @Override
    public void heroDescription() {
        String description = "\nLow damage. \nMasters of stealth and infiltration.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 5;
    }
}
