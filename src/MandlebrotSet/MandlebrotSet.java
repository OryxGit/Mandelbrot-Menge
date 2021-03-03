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
        System.out.println(Integer.toHexString(16));
        for (int re = -1000; re <= 1000; re++) {
            for (int im = -1000; im <= 1000; im++) {
                int conv = converges((new Complex(re / UNIT, im / UNIT)));
                if (conv < 2)
                    points.add(new Point(re, im, Color.decode("#000000")));
                else if (conv < 6)
                    points.add(new Point(re, im, Color.decode("#001713")));
                else if (conv < 12)
                    points.add(new Point(re, im, Color.decode("#001c17")));
                else if (conv < 24)
                    points.add(new Point(re, im, Color.decode("#002921")));
                else if( conv < 48)
                    points.add(new Point(re, im, Color.decode("#00362c")));
                else if (conv < 96)
                    points.add(new Point(re, im, Color.decode("#004236")));
                else if (conv < 112)
                    points.add(new Point(re, im, Color.decode("#015445")));
                else if (conv < 128)
                    points.add(new Point(re, im, Color.decode("#01614f")));
                else if (conv < 144)
                    points.add(new Point(re, im, Color.decode("#00735d")));
                else if (conv < 160)
                    points.add(new Point(re, im, Color.decode("#00876d")));
                else if (conv < 176)
                    points.add(new Point(re, im, Color.decode("#009477")));
                else if (conv < 192)
                    points.add(new Point(re, im, Color.decode("#00a383")));
                else if (conv < 208)
                    points.add(new Point(re, im, Color.decode("#00c49d")));
                else if (conv < 224)
                    points.add(new Point(re, im, Color.decode("#02d9ae")));
                else if (conv < 240)
                    points.add(new Point(re, im, Color.decode("#05ffcd")));
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