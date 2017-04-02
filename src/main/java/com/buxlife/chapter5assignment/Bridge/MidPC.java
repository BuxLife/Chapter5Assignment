package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class MidPC extends Computer{
    public MidPC(Processor processor){
        this.power = 50;
        this.processor = processor;

    }

    @Override
    public void startPC() {
        System.out.println("Mid Level PC");
        System.out.println("PC Starting up...");
        int processorSpeed = processor.run();
        powerRatings(processorSpeed);

    }
}
