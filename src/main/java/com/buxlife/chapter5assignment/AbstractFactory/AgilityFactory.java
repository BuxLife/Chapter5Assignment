package com.buxlife.chapter5assignment.AbstractFactory;

public class AgilityFactory extends HeroFactory{

    @Override
    public Hero getHero(String type) {
        if ("Ranger".equals(type)) {return new Ranger();}
        else {return new Bard();}}
}