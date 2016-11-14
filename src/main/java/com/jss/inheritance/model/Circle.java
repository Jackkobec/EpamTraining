package com.jss.inheritance.model;

/**
 * Inheritance.
 * Circle
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (xCenter != circle.xCenter) return false;
        if (yCenter != circle.yCenter) return false;
        return radius == circle.radius;

    }

    @Override
    public int hashCode() {
        int result = xCenter;
        result = 31 * result + yCenter;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", radius=" + radius +
                '}';
    }
}
