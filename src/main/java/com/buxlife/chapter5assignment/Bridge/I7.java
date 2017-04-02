package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class I7 implements Processor{


    int psu;

    public I7(){
        psu = 20;
    }

    public int run() {
        System.out.println("High end processor");
        System.out.println("i7 Processor: 3.0GHZ.");
        return psu;
    }

}
