package com.buxlife.chapter5assignment.Visitor;

import java.util.List;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public interface RideVisitor {

    public void visit(RollerCoaster rollerCoaster);
    public void visit(FerrisWheel ferrisWheel);
    public void visit(Slide slide);
    public void visit(List<RideElement> elementList);
}
