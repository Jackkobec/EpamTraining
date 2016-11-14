package com.jss.inheritance.run;

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
    }

}
