package com.jss.inheritance.model;

/**
 * Inheritance.
 * Circumference
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public abstract class Circumference {

    protected Point center;
    protected int radius;

    public Circumference(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circumference that = (Circumference) o;

        if (radius != that.radius) return false;
        return center != null ? center.equals(that.center) : that.center == null;

    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Circumference{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
