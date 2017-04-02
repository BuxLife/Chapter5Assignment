package com.buxlife.chapter5assignment.Singleton;

/*
    Author: Naeem Bux       Filename: Calculator.java
    File Description:       A class implementing the Singleton Design Pattern, a Creational Pattern.
                            Classic Singleton pattern
 */

public class Calculator{

    private static Calculator calculator = null;


    private Calculator(){
        /*This constructor is declared private to prevent external classes from creating an instance of this class.*/
    }
    public static Calculator getInstance(){
        if (calculator == null){
            calculator = new Calculator();
        }
        return calculator;
    }
    protected static int add(int a, int b){
        return (a+b);
    }
    protected static int subtract(int a, int b){
        return (a-b);
    }




}