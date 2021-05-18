package com.company;

import javax.swing.*;
import java.awt.*;

final public class Parabola extends Canvas {
    public Parabola(double x, boolean check) {
        JFrame frame;
        if (check)
            frame = new JFrame("Задача Б - квадратная парабола");
        else
            frame = new JFrame("Задача Б - кубическая парабола");

        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();

        DrawPanel drawPanel = new DrawPanel(frame, x, check);
        frame.add(drawPanel);

        frame.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    private final double y;
    private boolean check;

    DrawPanel(JFrame frame, double x, boolean check) {
        this.y = Math.pow(x, 2);
        this.check = check;
        Dimension size = frame.getSize();
        setPreferredSize(new Dimension(size.width - 20, size.height - 100));
    }

    @Override
    public void paint(Graphics g) {
        if (this.check) {
            g.setColor(Color.YELLOW);
            for (double x = -Math.pow(this.y, 2); x <= Math.pow(this.y, 2); x = x + 0.1) {
                double y = 1 * x * x + 0 * x + 0;
                int xp = (int) Math.round(200 + x * 20);
                int yp = (int) Math.round(200 - y * 20);
                g.drawRect(xp - 2, yp - 2, 5, 5);
            }
        } else {
            g.setColor(Color.BLUE);
            double y = 0;
            for (double x = -Math.pow(this.y, 2); x <= 0; x = x + 0.1) {
                y = 1 * x * x + 0 * x + 0;
                int xp = (int) Math.round(200 + x * 20);
                int yp = (int) Math.round(200 - y * 20);
                g.fillOval(xp - 2, yp - 2, 5, 5);
            }
            for (double x = 0; x <= Math.pow(this.y, 2); x = x + 0.1) {
                y = 1 * x * x + 0 * x + 0;
                int xp = (int) Math.round(200 + x * 20);
                int yp = (int) Math.round(200 + y * 20);
                g.fillOval(xp - 2, yp - 2, 5, 5);
            }
        }
    }
}