package com.buxlife.chapter5assignment.AbstractFactory;

public class StealthFactory extends HeroFactory{

    @Override
    public Hero getHero(String type) {
        if("Assassin".equals(type))
        {
            return new Assassin();
        }
        else
            return new Thief();
    }
}