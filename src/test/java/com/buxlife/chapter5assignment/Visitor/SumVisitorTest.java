package com.buxlife.chapter5assignment.Visitor;

import org.junit.Assert;
import org.junit.Test;
import sun.reflect.annotation.ExceptionProxy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class SumVisitorTest {
    @Test
    public void testSingleVisit() throws Exception {
        Slide slide = new Slide(20);


        TotalSumVisitor totalProfit = new TotalSumVisitor();
        totalProfit.visit(slide);
        System.out.println(totalProfit.getTotalDailyEarning());
        Assert.assertEquals(200.0, totalProfit.getTotalDailyEarning(), 0);
        //Asserts total daily earning for Single ride.
    }
    @Test
    public void testSingleVisitF() throws Exception {

        FerrisWheel ferrisWheel = new FerrisWheel(50);


        TotalSumVisitor totalProfit = new TotalSumVisitor();
        totalProfit.visit(ferrisWheel);
        System.out.println(totalProfit.getTotalDailyEarning());
        Assert.assertEquals(1000.0, totalProfit.getTotalDailyEarning(), 0);
        //Asserts total daily earning for Single ride.
    }
    @Test
    public void testSingleVisitR() throws Exception {

        RollerCoaster rollerCoaster = new RollerCoaster(100);

        TotalSumVisitor totalProfit = new TotalSumVisitor();
        totalProfit.visit(rollerCoaster);
        System.out.println(totalProfit.getTotalDailyEarning());
        Assert.assertEquals(3000.0, totalProfit.getTotalDailyEarning(), 0);
        //Asserts total daily earning for Single ride.
    }
    @Test
    public void testTotalVisits() throws Exception {
        Slide slide = new Slide(20);
        FerrisWheel ferrisWheel = new FerrisWheel(50);
        RollerCoaster rollerCoaster = new RollerCoaster(100);

        TotalSumVisitor totalProfit = new TotalSumVisitor();
        totalProfit.visit(slide);
        totalProfit.visit(ferrisWheel);
        totalProfit.visit(rollerCoaster);
        System.out.println(totalProfit.getTotalDailyEarning());
        Assert.assertEquals(4200.0, totalProfit.getTotalDailyEarning(), 0);
        //Asserts total daily earning for ALL ride. for this number of visitors.
    }

    @Test
    public void testNumberVisitors() throws Exception{
        Slide slide = new Slide(20);
        FerrisWheel ferrisWheel = new FerrisWheel(50);
        RollerCoaster rollerCoaster = new RollerCoaster(100);

        TotalSumVisitor totalProfit = new TotalSumVisitor();
        totalProfit.visit(slide);
        totalProfit.visit(ferrisWheel);
        totalProfit.visit(rollerCoaster);
        Assert.assertEquals(170, totalProfit.getTotalNumVisitors(), 0);
    }
}