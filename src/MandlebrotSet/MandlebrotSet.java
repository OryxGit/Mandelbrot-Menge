package MandlebrotSet;

import java.awt.*;
import java.util.ArrayList;
import Complex.Complex;
import GUI.Frame;
import GUI.Point;


public class MandlebrotSet {
    private static final double UNIT = 100;
    private static ArrayList<Point> points = new ArrayList<>();

    public static void main(String[] args) {
        for (int re = -200; re <= 200; re++) {
            for (int im = -200; im <= 200; im++) {
                int conv = converges((new Complex(re/UNIT, im/UNIT)));
                points.add(new Point(re, im, new Color(conv)));
                System.out.println("Re: " + re/UNIT + "Im: " + im/UNIT + "Conv: " + conv);
            }
        }
        Frame frame = new Frame(500, 500, points);
    }

    public static int converges(Complex c) {
        Complex zn = c;
        int steps = 256;
        for (int i = 0; i < 256; i++) {
            zn = Complex.add(Complex.mul(zn, zn), c);
            if (zn.getAbs() >= 2) {
                steps = i;
                break;
            }
        }
        return steps;
    }
}
