package com.buxlife.chapter5assignment.AbstractFactory;

public class DemoAbstractFactory{

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new AbstractFactory();

        HeroFactory altarOfStrength = abstractFactory.getHeroFactory("Strength");
        HeroFactory altarOfAgility = abstractFactory.getHeroFactory("Agility");
        HeroFactory altarOfStealth = abstractFactory.getHeroFactory("Stealth");

        Hero knight = altarOfStrength.getHero("Knight");
        Hero fighter = altarOfStrength.getHero("0");    //Assigns default hero.
        Hero assassin = altarOfStealth.getHero("Assassin");
        Hero thief = altarOfStealth.getHero("0");
        Hero ranger = altarOfAgility.getHero("Ranger");
        Hero bard = altarOfAgility.getHero("0");

        System.out.println("Hero Information: \n");
        knight.heroDescription();
        System.out.println("Power: " + knight.attack());

        System.out.println("Hero Information: \n");
        fighter.heroDescription();
        System.out.println("Power: " + fighter.attack());

        System.out.println("Hero Information: \n");
        assassin.heroDescription();
        System.out.println("Power: " + assassin.attack());

        System.out.println("Hero Information: \n");
        thief.heroDescription();
        System.out.println("Power: " + thief.attack());

        System.out.println("Hero Information: \n");
        ranger.heroDescription();
        System.out.println("Power: " + ranger.attack());

        System.out.println("Hero Information: \n");
        bard.heroDescription();
        System.out.println("Power: " + bard.attack());
    }
}