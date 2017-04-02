package com.buxlife.chapter5assignment.Visitor;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Slide implements RideElement{

    private int numVisits;
    private final double price = 10;

    public Slide(int visits){
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

    public double getPrice() {
        return price;
    }
}
