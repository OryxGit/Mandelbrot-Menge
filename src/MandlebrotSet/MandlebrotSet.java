package MandlebrotSet;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import Complex.Complex;
import GUI.Frame;
import GUI.Point;


public class MandlebrotSet {
    private static final double UNIT = 100;
    private static ArrayList<Point> points = new ArrayList<>();
    private static int val = 255;

    public static void main(String[] args) {
        for (int re = -200; re <= 200; re++) {
            for (int im = -200; im <= 200; im++) {
                int conv = converges((new Complex(re / UNIT, im / UNIT)));
                points.add(new Point(re, im, new Color((val - conv) % 255, (val - conv) % 255, (val - conv) % 255)));
            }
        }
        Frame frame = new Frame(500, 500, points);
    }

    public static int converges(Complex c) {
        Complex zn = c;
        int steps = val;
        for (int i = 1; i < val; i++) {
            zn = Complex.add(Complex.mul(zn, zn), c);
            if (zn.getAbs() >= 2) {
                steps = i;
                break;
            }
        }
        return steps;
    }
}
