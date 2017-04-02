package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Knight extends Hero {
    @Override
    public void heroDescription() {
        String description = "\nGreater than the basic fighter. \nSacrifices speed for defense and raw power.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 20;
    }
}
