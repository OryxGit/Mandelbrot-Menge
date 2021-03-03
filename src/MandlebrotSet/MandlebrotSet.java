package MandlebrotSet;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import Complex.Complex;
import GUI.Frame;
import GUI.Point;


public class MandlebrotSet {
    private static final double UNIT = 420;
    private static ArrayList<Point> points = new ArrayList<>();
    private static final int val = 255;

    public static void main(String[] args) {
        for (int re = -1000; re <= 1000; re++) {
            for (int im = -1000; im <= 1000; im++) {
                int conv = converges((new Complex(re / UNIT, im / UNIT)));
                if (conv < 2)
                    points.add(new Point(re, im, Color.decode("#0b0d21")));
                else if (conv < 4)
                    points.add(new Point(re, im, Color.decode("#091636")));
                else if (conv < 8)
                    points.add(new Point(re, im, Color.decode("#0f2561")));
                else if (conv < 16)
                    points.add(new Point(re, im, Color.decode("#133080")));
                else if( conv < 32)
                    points.add(new Point(re, im, Color.decode("#153eb0")));
                else if (conv < 64)
                    points.add(new Point(re, im, Color.decode("#174cd6")));
                else if (conv < 128)
                    points.add(new Point(re, im, Color.decode("#185afc")));
                else
                    points.add(new Point(re, im, Color.decode("#000000")));
            }
        }
        new Frame(1920, 1080, points);
    }

    public static int converges(Complex c) {
        Complex zn = c;
        int steps = val;
        for (int i = 0; i < val; i++) {
            zn = Complex.add(Complex.mul(zn, zn), c);
            if (zn.getAbs() >= 2) {
                steps = i;
                break;
            }
        }
        return steps;
    }
}