package com.buxlife.chapter5assignment.Visitor;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class RollerCoaster {


    int numVisits;
    private static final double price = 30;

    public RollerCoaster(int visits){
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
