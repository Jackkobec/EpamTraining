package com.jss.inheritance.controller;

import com.jss.inheritance.model.Circle;
import com.jss.inheritance.model.Point;

/**
 * Inheritance.
 * ICircleUtils
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public interface ICircleUtils {

    void changeRadius(Circle circle, int NewRadius);

    boolean isPointInsideTheCircle(Circle circle, Point point);

    void setCircleSize(Circle circle, int newSize);
}
