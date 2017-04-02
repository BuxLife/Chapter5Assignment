package com.buxlife.chapter5assignment.Bridge;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoBridge {

    public static void main(String[] args){

        Computer pcSlow = new EntryPC(new I3());
        Computer pcMid = new EntryPC(new I5());
        Computer pcHigh = new MidPC(new I5());
        Computer pcCustom = new HighPC(new I7());

        pcSlow.startPC();
        pcMid.startPC();
        pcHigh.startPC();
        pcCustom.startPC();


    }
}
