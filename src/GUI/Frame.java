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
        panel.setBackground(Color.WHITE);
        this.add(panel);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int startX = width / 2;
        int startY = height / 2;
        g.translate(startX, startY);

        for (Point p : pointList) {
            g.setColor(p.getColor());
            g.drawLine(p.getX(), -p.getY(), p.getX(), -p.getY());
        }
    }
}
