package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class HighPC extends Computer{

    public HighPC(Processor processor){
        this.power = 100;
        this.processor = processor;
    }
    @Override
    public void startPC() {
        System.out.println("High End PC");
        System.out.println("Pc is booting up...");
        int processorSpeed = processor.run();
        powerRatings(processorSpeed);

    }
}
