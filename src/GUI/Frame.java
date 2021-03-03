package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    JPanel panel = new JPanel();

    public Frame() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0, 0, 100, 100);
    }
}
