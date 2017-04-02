package com.buxlife.chapter5assignment.AbstractFactory;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Fighter extends Hero {

    @Override
    public void heroDescription() {
        String description = "\nBasic Fighter \nProficient in all basic combat skills.";
        System.out.println(description);
    }

    @Override
    public int attack() {
        return 15;
    }

}

