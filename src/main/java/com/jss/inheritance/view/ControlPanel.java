package com.jss.inheritance.view;

import com.jss.inheritance.controller.CircleUtils;
import com.jss.inheritance.controller.ICircleUtils;
import com.jss.inheritance.model.Factory;
import com.jss.inheritance.model.Point;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import static com.jss.inheritance.model.Constants.CLOSE_ALL;

/**
 * Inheritance.
 * ControlPanel
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 14.11.2016.
 */
public class ControlPanel extends JFrame {
    private java.awt.Graphics g;
    private ICircleUtils iCircleUtils = new CircleUtils();
    private Factory factory = new Factory();

    private int defaultCloseOperation = HIDE_ON_CLOSE;
    private Graphics graphics;

    public ControlPanel(Graphics graphics) {
        super("Control");
        this.graphics = graphics;


        //set minimal size of window
        setMinimumSize(new Dimension(202, 601));

        setLocation(graphics.getX() - 202, graphics.getY());
        getContentPane().setLayout(new BorderLayout());

        setDefaultCloseOperation(CLOSE_ALL);
        addComponents(getContentPane());

        setVisible(true);
    }

    private void addComponents(Container contentPane) {

        JPanel graphicsPanel = new JPanel(new GridLayout(0, 1));

        JPanel forCenterEndRadiusPanl = new JPanel(new BorderLayout());
        JLabel centerCoordinateLabel = new JLabel("Ведите координаты центра:");
        centerCoordinateLabel.setHorizontalAlignment(SwingConstants.CENTER);

        forCenterEndRadiusPanl.add(centerCoordinateLabel, BorderLayout.NORTH);

        JPanel textFieldsForCenterPoint = new JPanel(new GridLayout(0, 4));
        JLabel xLabel = new JLabel("Xc:");
        xLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel yLabel = new JLabel("Yc:");
        yLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField xCenter = new JTextField();
        JTextField yCenter = new JTextField();

        textFieldsForCenterPoint.add(xLabel);
        textFieldsForCenterPoint.add(xCenter);
        textFieldsForCenterPoint.add(yLabel);
        textFieldsForCenterPoint.add(yCenter);

        forCenterEndRadiusPanl.add(textFieldsForCenterPoint, BorderLayout.CENTER);
        graphicsPanel.add(forCenterEndRadiusPanl);

        JPanel radiusPanel = new JPanel(new GridLayout(0, 1));
        JLabel radiusLabel = new JLabel("Ведите радиус: ");
        radiusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        radiusPanel.add(radiusLabel);
        JTextField radius = new JTextField();
        radiusPanel.add(radius);

        graphicsPanel.add(radiusPanel);


        JButton jButton = new JButton("Нарисовать");
        jButton.addActionListener(e -> {
            int xCen = Integer.parseInt(xCenter.getText()) * 20;
            int yCen = Integer.parseInt(yCenter.getText()) * 20;
            int rad = Integer.parseInt(radius.getText()) * 20;
            g = graphics.getGraphics();
            g.drawOval(xCen + 350 - rad, 350 - yCen - rad, rad * 2, rad * 2);
            graphics.paint(g);
        });

        graphicsPanel.add(jButton);

        JPanel infoPanel = new JPanel(new BorderLayout());
        JLabel infoLabel = new JLabel("<html>Для ввода координат используйте<br>целые числа от -15 до 15,<br>для радиуса числа > 0<br>=========================</html>");
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoPanel.add(infoLabel, BorderLayout.NORTH);

        graphicsPanel.add(infoPanel);
        JPanel drawOvalPanel = new JPanel(new BorderLayout());
        drawOvalPanel.add(graphicsPanel, BorderLayout.NORTH);


        JPanel forPointPanel = new JPanel(new BorderLayout());
        JLabel pointLabel = new JLabel("Ведите координаты точки:");
        pointLabel.setHorizontalAlignment(SwingConstants.CENTER);
        forPointPanel.add(pointLabel, BorderLayout.NORTH);

        JPanel textFieldsForPoint = new JPanel(new GridLayout(0, 4));
        JLabel xLabelPoint = new JLabel("Xp:");
        xLabelPoint.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel yLabelPoint = new JLabel("Yp:");
        yLabelPoint.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField xCenterPoint = new JTextField();
        JTextField yCenterPoint = new JTextField();
        textFieldsForPoint.add(xLabelPoint);
        textFieldsForPoint.add(xCenterPoint);
        textFieldsForPoint.add(yLabelPoint);
        textFieldsForPoint.add(yCenterPoint);

        JPanel pointButtonPanel = new JPanel(new BorderLayout());
        JButton drawPoint = new JButton("Нарисовать точку");
        drawPoint.addActionListener(e -> {
            int xCen = Integer.parseInt(xCenterPoint.getText()) * 20;
            int yCen = Integer.parseInt(yCenterPoint.getText()) * 20;
            int rad = 4;

            g = graphics.getGraphics();
            Graphics2D gr2d = (Graphics2D) g;
            gr2d.setPaint(Color.RED);
            g.fillOval(xCen + 350 - rad, 350 - yCen - rad, rad * 2, rad * 2);
            graphics.paint(g);
        });

        JButton calculateButton = new JButton("Расчитать");
        calculateButton.addActionListener(e -> {

            int xCen = Integer.parseInt(xCenter.getText());
            int yCen = Integer.parseInt(yCenter.getText());
            int rad = Integer.parseInt(radius.getText());
            //Point center = factory.createPoint(xCen, yCen);
            com.jss.inheritance.model.Circle circle = factory.createCircle(xCen, yCen, rad);

            int xPoint = Integer.parseInt(xCenterPoint.getText());
            int yPoint = Integer.parseInt(yCenterPoint.getText());
            Point point = factory.createPoint(xPoint, yPoint);

            if (iCircleUtils.isPointInsideTheCircle(circle, point)) {
                JOptionPane.showMessageDialog(null,
                        "Точка внутри круга",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Точка вне круга",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        pointButtonPanel.add(drawPoint, BorderLayout.NORTH);
        pointButtonPanel.add(calculateButton, BorderLayout.CENTER);

        JPanel authorPanel = new JPanel(new BorderLayout());
        JLabel authorLabel = new JLabel("<html><font size=\"3\" color=\"orange\" face=\"Arial\">Author Jack </font></html>");
        authorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel imgPanel = new JPanel() {
            public void paint(java.awt.Graphics g) {
                super.paint(g);
                try {
                    Image img = ImageIO.read(new File("src/main/java/com/jss/inheritance/view/icons/Author.png"));
                    g.drawImage(img, 5, 5, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
        authorPanel.add(authorLabel, BorderLayout.NORTH);
        authorPanel.add(imgPanel, BorderLayout.CENTER);

        forPointPanel.add(textFieldsForPoint, BorderLayout.CENTER);
        forPointPanel.add(pointButtonPanel, BorderLayout.SOUTH);
        drawOvalPanel.add(forPointPanel, BorderLayout.CENTER);


        getContentPane().add(drawOvalPanel, BorderLayout.NORTH);
        getContentPane().add(authorPanel, BorderLayout.CENTER);

    }


    @Override
    public void setDefaultCloseOperation(int operation) {
        if (operation != DO_NOTHING_ON_CLOSE &&
                operation != HIDE_ON_CLOSE &&
                operation != DISPOSE_ON_CLOSE &&
                operation != EXIT_ON_CLOSE &&
                operation != CLOSE_ALL) {
            throw new IllegalArgumentException("defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        }

        if (operation == EXIT_ON_CLOSE) {
            SecurityManager security = System.getSecurityManager();
            if (security != null) {
                security.checkExit(0);
            }
        }
        if (this.defaultCloseOperation != operation) {
            int oldValue = this.defaultCloseOperation;
            this.defaultCloseOperation = operation;
            firePropertyChange("defaultCloseOperation", oldValue, operation);
        }
    }

    @Override
    protected void processWindowEvent(final WindowEvent e) {
        super.processWindowEvent(e);

        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            switch (defaultCloseOperation) {
                case HIDE_ON_CLOSE:
                    setVisible(false);
                    break;
                case DISPOSE_ON_CLOSE:
                    dispose();
                    break;
                case EXIT_ON_CLOSE:
                    // This needs to match the checkExit call in
                    // setDefaultCloseOperation
                    System.exit(0);
                    break;
                case DO_NOTHING_ON_CLOSE:
                    //My CloseOperation - close all windows
                case CLOSE_ALL:
                    dispose();
                    graphics.dispose();
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
