package com.jss.inheritance.controller;

import com.jss.inheritance.model.Circle;
import com.jss.inheritance.model.Point;

/**
 * Inheritance.
 * CircleUtils
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public class CircleUtils implements ICircleUtils {

    @Override
    public void changeRadius(Circle circle, int NewRadius) {

        circle.setRadius(NewRadius);
    }

    @Override
    public boolean isPointInsideTheCircle(Circle circle, Point point) {

        if (null == circle || point == null) {
            throw new NullPointerException("Circle or Point = null");
        }

        int xPoint = point.getX();
        int yPoint = point.getY();

        int xCenter = circle.getxCenter();
        int yCenter = circle.getyCenter();
        int radius = circle.getRadius();

        //лежит на поверхности окуржности
        if ((xPoint - xCenter) * (xPoint - xCenter) +
                (yPoint - yCenter) * (yPoint - yCenter) == radius * radius) {
            return true;
            //лежит внутри окружности
        } else if ((xPoint - xCenter) * (xPoint - xCenter) +
                (yPoint - yCenter) * (yPoint - yCenter) < radius * radius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setCircleSize(Circle circle, int newSize) {

        int newRadius = (int) Math.sqrt(newSize / Math.PI);
        changeRadius(circle, newRadius);
    }
}
