package com.buxlife.chapter5assignment.Visitor;

import java.util.List;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class TotalSumVisitor implements RideVisitor{

    private int totalNumVisitors = 0;
    private double totalDailyEarnings;

    public void visit(Slide slide) {
        totalNumVisitors += slide.getNumVisits();
        double visitEarnings = slide.getNumVisits() * slide.getPrice();
        totalDailyEarnings += visitEarnings;
    }

    public void visit(FerrisWheel ferrisWheel) {
        totalNumVisitors += ferrisWheel.getNumVisits();
        double visitEarnings = ferrisWheel.getNumVisits() * ferrisWheel.getPrice();
        totalDailyEarnings += visitEarnings;
    }

    public void visit(RollerCoaster rollerCoaster) {
        totalNumVisitors += rollerCoaster.getNumVisits();
        double visitEarnings = rollerCoaster.getNumVisits() * rollerCoaster.getPrice();
        totalDailyEarnings += visitEarnings;
    }


    public void visit(List<RideElement> elementList) {
        for (RideElement ride: elementList){
            ride.accept(this);
        }

    }

    public double getTotalDailyEarning() {
        return totalDailyEarnings;
    }

    public int getTotalNumVisitors() {
        return totalNumVisitors;
    }
}


