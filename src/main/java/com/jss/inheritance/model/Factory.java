package com.jss.inheritance.model;

/**
 * Created by Jack on 14.11.2016.
 */
public class Factory {

    public Point createPoint(int x, int y) {

        return new Point(x, y);
    }

    public Circle createCircle(int xCenter, int yCenter, int radius) {

        return new Circle(createPoint(xCenter, yCenter), radius);
    }

}
