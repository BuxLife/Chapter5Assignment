package com.buxlife.chapter5assignment.Prototyping;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Product implements Prototype{

    private String name;
    private int id;

    public Product(String name, int id){
        this.name = name;
        this.id = id;
    }


    public Prototype createCopy() {
        return new Product(name, id);
    }

    @Override
    public String toString() {
        return ("Product Details: \nID: " + id + "\nName: " + name);
    }
}
