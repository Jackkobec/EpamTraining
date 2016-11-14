package com.jss.inherianse;

/**
 * Created by Jack on 12.11.2016.
 */

import java.awt.*;
import javax.swing.JFrame;

public class GraphicsMain extends JFrame {

    public GraphicsMain() {
        super("simpleApp");
        setSize(700, 600);
        setVisible(true);
    }
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

        g.drawLine(20, 220, 20, 350);
g.drawLine(20, 350, 360, 350);
g.drawString("Y", 25, 230);
g.drawString("X", 350, 346);

        Point aPoint = new Point(50, 190);
        g.drawLine(55,55,55,55);
        g.drawOval(220, 360, 60, 60);
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
    }
}
