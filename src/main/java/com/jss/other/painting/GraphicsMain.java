package com.jss.inheritance.painting;

/**
 * Created by Jack on 12.11.2016.
 */

import java.awt.*;
import javax.swing.*;

public class GraphicsMain extends JFrame {

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


    //private ControlPanel controlPanel;


    public void setOvalParameters(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }


    public GraphicsMain() {

        super("View");


        setBounds(locationX, locationY, sizeWidth, sizeHeight);
        //set minimal size of window
        setMinimumSize(new Dimension(700, 601));
        //setLocation(controlPanel.getX() + 177, controlPanel.getY());

        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //addComponents(getContentPane());
        setVisible(true);


    }


//    private void addComponents(Container contentPane) {
//        //contentPane.setLayout(new BorderLayout());
//
//
//        JPanel graphicsPanel = new JPanel();
//
//        getContentPane().add(graphicsPanel, BorderLayout.CENTER);
//
//
//        Font font = new Font("Tamoha", Font.BOLD, 16);
//        JPanel buttonPanel = new JPanel(new GridLayout(1,4));
//        buttonPanel.add(new JButton("wfef"));
//        buttonPanel.add(new JButton("wfef"));
//        buttonPanel.add(new JButton("wfef"));
//        buttonPanel.add(new JButton("wfef"));
//
//        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
//
//
//    }
//
    // Draw axes;

//g.drawLine(20, 220, 20, 350);
//g.drawLine(20, 350, 360, 350);
//g.drawString("Y", 25, 230);
//g.drawString("X", 350, 346);
    //

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.green);
        // Рисуем простые линии
//        gr2d.setPaint(Color.RED);
//        gr2d.drawLine(20, 220, 20, 350);
//        g.drawString("Y", 25, 230);
//        gr2d.setPaint(Color.BLUE);
//        gr2d.drawLine(20, 350, 360, 350);
//        g.drawString("X", 350, 346);

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
            g.drawString("" + j, x-12, 370); //0.0  is 350 350
        }

        gr2d.setPaint(Color.BLACK);
        gr2d.setStroke(new BasicStroke(4));
       // g.drawString("x", 645, 383);
       // g.drawString("X", 340, 60);
       // g.drawString("0", 352, 362); //0.0  is 350 350

//        Point aPoint = new Point(50, 190);
//        g.drawLine(55, 55, 55, 55);


        gr2d.setStroke(new BasicStroke(4));
        gr2d.setPaint(Color.YELLOW.darker());
        //g.drawOval(250, 250, 200, 200); // x - radius , y - radius  =  position of the center x = 350 , y = 350
        g.drawOval(x, y, x2, y2); // x - radius , y - radius  =  position of the center x = 350 , y = 350
        //addComponents(this);


//        // Рисуем многоугольник (треуголник или звезда
//        // частный случай многоугольника)
//        BasicStroke с = new BasicStroke(3); //толщина линии 3  многоугольника
//        gr2d.setStroke(с);
//
//        gr2d.setPaint(Color.MAGENTA);
//        Polygon j = new Polygon();
//        j.addPoint(270, 439);
//        j.addPoint(185, 400);
//        j.addPoint(100, 470);
//        j.addPoint(200, 550);
//        j.addPoint(240, 590);
//        j.addPoint(270, 539);
//        g.drawPolygon(j);
//
//        gr2d.setPaint(Color.YELLOW);
//        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
//        gr2d.setPaint(Color.DARK_GRAY);
//        //Прямоугольник с закругленными краями
//        gr2d.drawRoundRect(500, 500, 70, 40, 10, 10);
//        // Фигура овал
//        gr2d.drawOval(300, 50, 300, 300);
//        // Заполненный овал
//        gr2d.fillOval(100, 50, 200, 300);
//        gr2d.setPaint(Color.pink);
//        gr2d.drawArc(100, 200, 300, 300, ABORT, ABORT);
//        // Получаем толстую линию
//        gr2d.setPaint(Color.lightGray);
//        BasicStroke p = new BasicStroke(10); //толщина линии 20
//        gr2d.setStroke(p);
//        //Овал с толстой линией
//        gr2d.drawOval(100, 100, 300, 300);
//        gr2d.setPaint(Color.red);
//        //Получаем цветной треугольник
//        for (int i = 0; i < 30; i++) {
//            gr2d.setPaint(Color.getHSBColor(5 + i * 350, 5 + i * 100, 5 + i * 100));
//            gr2d.drawLine(400 + i * 5, 400 - i * 6, 400 + i * 4, 400 + i * 3);
//        }
//
//
//        //clearRect очищает указанную область(координаты левого верхнего                      //угла прямоугольника;
//        //width — ширина прямоугольника;
//        //height — высота прямоугольника, вырезанная область зеленого цвета                 // фона
//        gr2d.clearRect(50, 40, 200, 200);


    }


    public static void main(String args[]) {

        GraphicsMain app = new GraphicsMain();
        ControlPanel controlPanel = new ControlPanel(app);
    }
}
