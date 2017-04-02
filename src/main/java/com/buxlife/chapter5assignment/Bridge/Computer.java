package com.buxlife.chapter5assignment.Bridge;

/*
    Author: Naeem Bux       Filename: Computer.java
    File Description:       Implements the Bridge Structural Pattern
 */
public abstract class Computer {

    Processor processor;
    int power;
    int powerRating;

    public abstract void startPC();

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public void powerRatings(int rating){
        powerRating = power+rating;
        if (powerRating >= 70){
            System.out.println("Power Rating: " + powerRating);
            System.out.println("PC Description: Gaming PC\n");
        }
        else if ((powerRating >=45) && (powerRating<70)){
            System.out.println("Power Rating: " + powerRating);
            System.out.println("PC Description: Media PC\n");
        }
        else{
            System.out.println("Power Rating: " + powerRating);
            System.out.println("PC Description: Home PC\n");
        }
    }

    public int getPowerRating() {
        return powerRating;
    }
}
