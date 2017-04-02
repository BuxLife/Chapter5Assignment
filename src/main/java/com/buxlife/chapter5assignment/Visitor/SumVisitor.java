package com.buxlife.chapter5assignment.Visitor;

import java.util.List;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class SumVisitor implements RideVisitor{

    private double visitEarnings;

    public void visit(Slide slide) {
        visitEarnings = slide.getNumVisits() * slide.getPrice();
        System.out.println("Ride Details:\nSlide\nNumber of Visitors: " + slide.getNumVisits());
        System.out.println("Daily Earnings: R" + visitEarnings);
    }

    public void visit(FerrisWheel ferrisWheel) {
        visitEarnings = ferrisWheel.getNumVisits() * ferrisWheel.getPrice();
        System.out.println("Ride Details:\nFerris Wheel\nNumber of Visitors: " + ferrisWheel.getNumVisits());
        System.out.println("Daily Earnings: R" + visitEarnings);
    }

    public void visit(RollerCoaster rollerCoaster) {
        visitEarnings = rollerCoaster.getNumVisits() * rollerCoaster.getPrice();
        System.out.println("Ride Details:\nRoller Coaster\nNumber of Visitors: " + rollerCoaster.getNumVisits());
        System.out.println("Daily Earnings: R" + visitEarnings);
    }

    public void visit(List<RideElement> elementList) {
        for (RideElement ride: elementList){
            ride.accept(this);
        }
    }

    public double getVisitEarnings() {
        return visitEarnings;
    }
}
