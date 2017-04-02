package com.buxlife.chapter5assignment.Prototyping;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Person implements Prototype{

    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Prototype createCopy() {
        return new Person(name, age);
    }

    @Override
    public String toString() {
        return ("Personal Details: \nName: " + name + "\nAge:" + age);
    }
}
