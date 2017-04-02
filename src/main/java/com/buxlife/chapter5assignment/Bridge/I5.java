package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class I5 implements Processor{

    int powerRating;

    public I5(){
        powerRating = 15;
    }
    public int run() {
        System.out.println("Mid level processor");
        System.out.println("i5 Processor: 1.5GHZ.");
        return powerRating;
    }
}

