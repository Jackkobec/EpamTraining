package com.jss.inherianse;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Jack on 12.11.2016.
 */
public class Circle extends Ellipse2D {

    private Point pointl;

    private double width;
    private double heigth;

    public Circle() {
        pointl = new Point();
    }

    public Circle(double x, double y, double width, double heigth) {
        pointl = new Point((int)x, (int)y);

        this.width = width;
        this.heigth = heigth;

    }

    @Override
    public double getX() {
        return pointl.getX();
    }

    @Override
    public double getY() {
        return pointl.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return heigth;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double width, double heigth) {
        pointl.setLocation(x, y);
        this.width = width;
        this.heigth = heigth;

    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
