package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class EntryPC extends Computer {

    public EntryPC(Processor processor){
        this.power = 25;
        this.processor = processor;
    }
    @Override
    public void startPC() {
        System.out.println("Entry Level PC");
        System.out.println("Pc is booting up...");
        int processorSpeed = processor.run();
        powerRatings(processorSpeed);

    }
}
