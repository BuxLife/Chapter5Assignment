package com.buxlife.chapter5assignment.Visitor;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class FerrisWheel implements RideElement
{


    int numVisits;
    private static final double price = 20;

    public FerrisWheel(int visits){
        this.numVisits = visits;
    }

    public void accept(RideVisitor visitor) {
        visitor.visit(this);
    }

    public void setNumVisits(int numVisits) {
        this.numVisits = numVisits;
    }

    public int getNumVisits() {
        return numVisits;
    }

    public static double getPrice() {
        return price;
    }
}
