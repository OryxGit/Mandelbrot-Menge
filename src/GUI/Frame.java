package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    JPanel panel = new JPanel();
    int width, height;

    public Frame() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
    }

    //temp
    int x, y;
    Color color;
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
        g.setColor(Color.WHITE);
        g.drawLine(-200, 0, 200, 0);
        g.drawLine(0, 200, 0, -200);
        for (Point p : pointList){
            g.setColor(p.color);
            g.drawOval(p.x,-p.y,1,1);
        }
    }
}
