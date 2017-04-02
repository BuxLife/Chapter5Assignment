package com.buxlife.chapter5assignment.Singleton;

/*
    Author: Naeem Bux       Filename: Calculator.java
    File Description:       A class implementing the Singleton Design Pattern, a Creational Pattern.
                            Classic Singleton pattern, implementing lazy instantiation.
 */


public class DemoSingleton{

    public static void main(String[] args){
        Calculator calculator = Calculator.getInstance();
        calculator.add(12, 24);
        calculator.subtract(18, 16);

    }

}