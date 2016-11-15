package com.jss.inheritance.view;

/**
 * Created by Jack on 12.11.2016.
 */

import java.awt.*;
import javax.swing.*;

/**
 * Inheritance.
 * Graphics
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public class Graphics extends JFrame {

    public int x;
    private int y;
    private int x2;
    private int y2;

    private static int sizeWidth = 700;
    private static int sizeHeight = 601;

    private final JTabbedPane pane = new JTabbedPane();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int locationX = (screenSize.width - sizeWidth) / 2;
    private int locationY = (screenSize.height - sizeHeight) / 2;

    public void setOvalParameters(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }


    public Graphics() {

        super("View");


        setBounds(locationX, locationY, sizeWidth, sizeHeight);
        //set minimal size of window
        setMinimumSize(new Dimension(700, 601));

        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);


    }

    @Override
    public void paint(java.awt.Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.green);

        gr2d.setStroke(new BasicStroke(2));
        gr2d.setPaint(Color.BLUE);
        //y
        g.drawLine(350, 50, 350, 550);
        //draw dividers for y
        for (int y = 50;
             y <= 550; y = y + 20) {
            g.drawLine(345, y, 355, y);
        }

//        for (int y = 50, j = -15;
//             y <= 550; y = y + 20, j++) {
//            if (y < 270) {
//                g.drawString("" + j, 360,  y+15); //0.0  is 350 350
//            }
//        }


        //x
        g.drawLine(50, 350, 650, 350);
        //draw dividers for x
        for (int x = 50;
             x <= 650; x = x + 20) {
            g.drawLine(x, 345, x, 355);
        }
        //x dividers digits from -15 to -1
        for (int x = 50, j = -15;
             x <= 650; x = x + 20, j++) {
            if (x < 350) {
                g.drawString("" + j, x, 370); //0.0  is 350 350
            }
        }
        // x dividers digits from 1 to 15
        for (int x = 370, j = 1;
             x <= 650; x = x + 20, j++) {
            g.drawString("" + j, x - 12, 370); //0.0  is 350 350
        }

        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(new BasicStroke(4));
        // g.drawString("x", 645, 383);
        // g.drawString("X", 340, 60);
        // g.drawString("0", 352, 362); //0.0  is 350 350


        gr2d.setStroke(new BasicStroke(5));
        gr2d.setPaint(Color.YELLOW.darker());
        g.drawOval(x, y, x2, y2); // x - radius , y - radius  =  position of the center x = 350 , y = 350

    }
}
