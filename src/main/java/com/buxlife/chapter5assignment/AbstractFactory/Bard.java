package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Bard extends Hero{

    @Override
    public void heroDescription() {
        String description = "\nHigh diplomacy. \nSupport hero. \nStrengthening allies and weakening enemies through the power of song.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 5;
    }
}
