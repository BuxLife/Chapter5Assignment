package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Assassin extends Hero{
    @Override
    public void heroDescription() {
        String description = "\nMore offensive than the classic rogue. \nImproved stealth and killing ability.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 12;
    }
}
