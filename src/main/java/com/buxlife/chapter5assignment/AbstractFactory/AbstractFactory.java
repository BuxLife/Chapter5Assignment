package com.buxlife.chapter5assignment.AbstractFactory;
/*
    Author: Naeem Bux       Filename: AbstractFactory.java
    File Description:       A class implementing the Abstract Factory Design Pattern, a Creational Pattern.
 */
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