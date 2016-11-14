package com.jss.inheritance.model;

/**
 * Created by Jack on 14.11.2016.
 */
public abstract class Circumference {

    protected Point center;
    protected int radius;

    public Circumference(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
}
