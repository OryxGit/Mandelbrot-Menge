package MandlebrotSet;

import GUI.Frame;

import java.awt.*;

public class MandlebrotSet {
    public static void main(String[] args) {
        Frame frame = new Frame(500, 500);
        for (int i = 0; i < 100; i++) {
            frame.addPoint(i, i*i, Color.CYAN);
        }
    }
}
