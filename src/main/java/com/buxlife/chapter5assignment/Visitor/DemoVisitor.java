package com.buxlife.chapter5assignment.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoVisitor {
    public static void main (String[] args){

        Slide slide = new Slide(20);
        FerrisWheel ferrisWheel = new FerrisWheel(50);
        RollerCoaster rollerCoaster = new RollerCoaster(100);

        List<RideElement> ridesList = new ArrayList<RideElement>();
        ridesList.add(slide);
        ridesList.add(ferrisWheel);
        ridesList.add(rollerCoaster);

        System.out.println();
        RideVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(ridesList);

        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(ridesList);
        System.out.println("Total Number of Visitors: " + totalSumVisitor.getTotalNumVisitors());
        System.out.println("Total Earnings: R" + totalSumVisitor.getTotalDailyEarning());

    }
}
