package com.buxlife.chapter5assignment.AbstractFactory;

public class StrengthFactory extends HeroFactory{

    @Override
    public Hero getHero(String type) {
        if("Knight".equals(type))
        {
            return new Knight();
        }else
        {
            return new Fighter();
        }
    }
}