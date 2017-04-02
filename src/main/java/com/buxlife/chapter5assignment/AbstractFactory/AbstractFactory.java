package com.buxlife.chapter5assignment.AbstractFactory;

public class AbstractFactory{
    public HeroFactory getHeroFactory(String type){

        if("Strength".equals(type)){
            return new StrengthFactory();
        }else if("Stealth".equals(type)){
            return new StealthFactory();
        }else{
            return new AgilityFactory();
        }
    }

}