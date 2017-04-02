package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class I3 implements Processor{
    int powerRating;

    public I3(){
        powerRating = 10;
    }
    public int run() {
        System.out.println("Entry level processor");
        System.out.println("i3 Processor: 750 MHZ");
        return powerRating;
    }
}
