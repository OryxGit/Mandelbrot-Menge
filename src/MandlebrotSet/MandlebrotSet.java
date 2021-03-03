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
                if (conv < 16)
                    points.add(new Point(re, im, Color.decode("#000000")));
                else if (conv < 32)
                    points.add(new Point(re, im, Color.decode("#F23A89")));
                else if (conv < 48)
                    points.add(new Point(re, im, Color.decode("#B42CF2")));
                else if (conv < 64)
                    points.add(new Point(re, im, Color.decode("#3A3FF2")));
                else if( conv < 80)
                    points.add(new Point(re, im, Color.decode("#6461FF")));
                else if (conv < 96)
                    points.add(new Point(re, im, Color.decode("#52B8FF")));
                else if (conv < 112)
                    points.add(new Point(re, im, Color.decode("#61FFD1")));
                else if (conv < 128)
                    points.add(new Point(re, im, Color.decode("#43E6BD")));
                else if (conv < 144)
                    points.add(new Point(re, im, Color.decode("#35E647")));
                else if (conv < 160)
                    points.add(new Point(re, im, Color.decode("#C4E643")));
                else if (conv < 176)
                    points.add(new Point(re, im, Color.decode("#CEFF4A")));
                else if (conv < 192)
                    points.add(new Point(re, im, Color.decode("#FFE13B")));
                else if (conv < 208)
                    points.add(new Point(re, im, Color.decode("#FFB44A")));
                else if (conv < 224)
                    points.add(new Point(re, im, Color.decode("#F5B75B")));
                else if (conv < 240)
                    points.add(new Point(re, im, Color.decode("#F57A4C")));
                else
                    points.add(new Point(re, im, Color.decode("#FFFFFF")));
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