package com.jss.inheritance.model;

/**
 * Created by Jack on 14.11.2016.
 */
public class Circle extends Circumference {

    private int xCenter;
    private int yCenter;

    private int radius;


    public Circle(Point center, int radius) {
        super(center, radius);
        this.radius = radius;
        xCenter = center.getX();
        yCenter = center.getY();
    }


    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
