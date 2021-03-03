package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    JPanel panel = new JPanel();
    int width, height;

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setBackground(Color.BLACK);
        this.add(panel);
    }

    //temp
    ArrayList<Point> pointList = new ArrayList<Point>();


    public void addPoint(int x, int y, Color color) {
        pointList.add(new Point(x, y, color));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int startX = width / 2;
        int startY = height / 2;
        g.translate(startX, startY);
        //coordinate axis
        g.setColor(Color.WHITE);
        g.drawLine(-200, 0, 200, 0);
        g.drawLine(0, 200, 0, -200);
        //values
        g.drawLine(100, 5, 100, -5);
        g.drawLine(-100, 5, -100, -5);
        g.drawLine(-5, 100, 5, 100);
        g.drawLine(-5, -100, 5, -100);
        //arrows
        g.drawLine(195, 5, 200 , 0);
        g.drawLine(195, -5, 200 , 0);
        g.drawLine(-5, -195, 0 , -200);
        g.drawLine(5, -195, 0 , -200);


        for (Point p : pointList){
            g.setColor(p.color);
            g.drawOval(p.x,-p.y,1,1);
        }
    }

    public void paintMandel(int x, int y, Color color) {

    }

    private class Point {
        private int x, y;
        private Color color;

        Point(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
}
