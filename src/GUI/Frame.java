package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    JPanel panel = new JPanel();
    int width, height;
    ArrayList<Point> pointList = new ArrayList<Point>();

    public Frame(int width, int height, ArrayList<Point> points) {
        this.width = width;
        this.height = height;
        this.pointList = points;
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setBackground(Color.BLACK);
        this.add(panel);
    }

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
        g.drawLine(195, 5, 200, 0);
        g.drawLine(195, -5, 200, 0);
        g.drawLine(-5, -195, 0, -200);
        g.drawLine(5, -195, 0, -200);


        for (Point p : pointList) {
            g.setColor(p.getColor());
            g.drawLine(p.getX(), -p.getY(), p.getX(), -p.getY());
        }
    }


    public void paintMandel(int x, int y, Color color) {

    }


}
