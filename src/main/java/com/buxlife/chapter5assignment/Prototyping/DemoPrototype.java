package com.buxlife.chapter5assignment.Prototyping;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoPrototype {

    public static void main(String[]args)
    {
        //Objects to clone
        Person kid = new Person ("Jimmy", 14);
        Person adult = new Person ("Ellen", 24);
        Product wheat = new Product("Wheat",1);

        //Clone objects
        Person newKid = (Person) kid.createCopy();
        Person newAdult = (Person) adult.createCopy();
        Product newGrain = (Product) wheat.createCopy();

        System.out.println(kid.toString());
        System.out.println(newKid.toString());

        System.out.println(adult.toString());
        System.out.println(newAdult.toString());

        System.out.println(wheat.toString());
        System.out.println(newGrain.toString());


    }
}
