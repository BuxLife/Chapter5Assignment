package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Ranger extends Hero{
    @Override
    public void heroDescription() {
        String description = "\nWoodsman, wildling survivor. \nProficient in swordplay, archery and basic magic. \nArchery seems to be the preffered weapon.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 18;
    }
}
