package Complex;

public class Complex {
    //Complex/Algebraic Numbers
    //Real and Imaginary part, Argument and Absolute Value (Distance from Origin)
    private double Re;
    private double Im;
    private double arg;
    private double abs;

    //Creates new Complex number from Cartesian Coordinates
    public Complex(double re, double im) {
        Re = re;
        Im = im;
        if (Im < 0)
            arg = Math.atan2(im, re) + 2 * Math.PI;
        else
            arg = Math.atan2(im, re);
        abs = Math.sqrt(Re * Re + Im * Im);
    }

    //Static-Methods
    //creates new Complex number from Polar Coordinates
    public static Complex Polar(double arg, double abs) {
        return new Complex(abs * Math.cos(arg), abs * Math.sin(arg));
    }

    //Arithmetics
    //Addition and Subtraction are programmed using Cartesian Coordinates
    //Format: z+w
    //Addition of Complex Numbers
    public static Complex add(Complex z, Complex w) {
        return new Complex(z.Re + w.Re, z.Im + w.Im);
    }

    //Addition of Complex and Real Numbers
    public static Complex add(Complex z, double w) {
        return new Complex(z.Re + w, z.Im);
    }

    public static Complex add(double z, Complex w) {
        return new Complex(z + w.Re, w.Im);
    }

    //Addition of Real Numbers
    public static Complex add(double z, double w) {
        return new Complex(z + w, 0);
    }

    //Format: z-w
    //Subtraction of Complex Numbers
    public static Complex sub(Complex z, Complex w) {
        return new Complex(z.Re - w.Re, z.Im - w.Im);
    }

    //Subtraction of Complex and Real Numbers
    public static Complex sub(Complex z, double w) {
        return new Complex(z.Re - w, z.Im);
    }

    public static Complex sub(double z, Complex w) {
        return new Complex(z - w.Re, -w.Im);
    }

    //Subtraction of Real Numbers
    public static Complex sub(double z, double w) {
        return new Complex(z - w, 0);
    }

    //Multiplication and Division are programmed using Polar Coordinates
    //Format: z*w
    //Multiplication of Complex Numbers
    public static Complex mul(Complex z, Complex w) {
        return Polar(z.arg + w.arg, z.abs * w.abs);
    }

    //Multiplication of Complex and Real Numbers
    public static Complex mul(Complex z, double w) {
        return Polar(z.arg, z.abs * w);
    }

    public static Complex mul(double z, Complex w) {
        return Polar(w.arg, z * w.abs);
    }

    //Multiplication of Real Numbers
    public static Complex mul(double z, double w) {
        return Polar(0, z * w);
    }

    //Format: z/w
    //Division of Complex Numbers
    public static Complex div(Complex z, Complex w) {
        if (w.abs == 0)
            throw new ArithmeticException("Division by 0");
        return Polar(z.arg - w.arg, z.abs / w.abs);
    }

    //Division of Complex and Real Numbers
    public static Complex div(Complex z, double w) {
        if (w == 0)
            throw new ArithmeticException("Division by 0");
        return Polar(z.arg, z.abs / w);
    }

    public static Complex div(double z, Complex w) {
        if (w.abs == 0)
            throw new ArithmeticException("Division by 0");
        return Polar(-w.arg, z / w.abs);
    }

    //Division of Real Numbers
    public static Complex div(double z, double w) {
        if (w == 0)
            throw new ArithmeticException("Division by 0");
        return Polar(0, z / w);
    }

    //Power using Complex numbers (including complex Exponents)
    //Format: z^w
    public static Complex pow(Complex z, Complex w) {
        //TODO
        return null;
    }

    //Complex-conjugate
    public static Complex conjugate(Complex z) {
        return new Complex(z.Re, -z.Im);
    }

    //Absolute Value
    public static double abs(Complex z) {
        return z.abs;
    }

    //Getter
    public double getRe() {
        return Re;
    }

    public double getIm() {
        return Im;
    }

    public double getArg() {
        return arg;
    }

    public double getAbs() {
        return abs;
    }
}
