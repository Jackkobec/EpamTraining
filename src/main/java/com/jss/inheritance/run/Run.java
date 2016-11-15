package com.jss.inheritance.run;

import com.jss.inheritance.model.Circle;
import com.jss.inheritance.model.Factory;
import com.jss.inheritance.view.ControlPanel;
import com.jss.inheritance.view.Graphics;

/**
 * Inheritance.
 * Run
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public final class Run {

    public static void main(String[] args) {

        Graphics app = new Graphics();
        ControlPanel controlPanel = new ControlPanel(app);

        Circle circle1 = new Factory().createCircle(2, 2, 3);
        Circle circle12 = new Factory().createCircle(2, 2, 3);

        System.out.println("circle1 equals circle12: " + circle1.equals(circle12));
        System.out.println("circle1 hashcode: " + circle1.hashCode());
        System.out.println("circle12 hashcode: " + circle12.hashCode());
        System.out.println("Сравнение hashcodes "
                + (circle1.hashCode() == circle12.hashCode() ? "true" : "false"));

    }
}
