package Complex;

public class Complex {
    //Complex/Algebraic Numbers
    //Real and Imaginary part
    private double Re;
    private double Im;
    private double arg;
    private double delt;

    //Creates new Complex number from Cartesian coordinates
    public Complex(double re, double im) {
        Re = re;
        Im = im;
        if(Im < 0)
            arg = Math.atan2(im, re) + 2*Math.PI;
        else
            arg = Math.atan2(im, re);
        delt = Math.sqrt(Re * Re + Im * Im);
    }

    //Static-Methods
    //creates new Complex number from Polar coordinates
    public static Complex Polar(double arg, double delt) {
        Complex z = new Complex(delt*Math.cos(arg), delt*Math.sin(arg));
        z.arg = arg;
        z.delt = delt;
        return z;
    }

    //Cartesian Arithmetic
    //Addition of Complex Numbers
    public static Complex addc(Complex z, Complex w) {
        return new Complex(z.Re + w.Re, z.Im + w.Im);
    }

    //Subtraction of Complex Numbers
    public static Complex subc(Complex z, Complex w) {
        Complex x = new Complex(-w.Re, -w.Im);
        return new Complex(z.Re + x.Re, z.Im + x.Im);
    }

    //Multiplication of Complex Numbers
    public static Complex mulc(Complex z, Complex w) {
        return new Complex(z.Re * w.Re - z.Im * w.Im, z.Re * w.Im + z.Im * w.Re);
    }

    //Division of Complex Numbers
    public static Complex divc(Complex z, Complex w) {
        if (w.Re == 0 && w.Im == 0) {
            throw new ArithmeticException("Division by 0");
        }
        double absw = abs(w);
        Complex x = new Complex(w.Re / (absw * absw), -w.Im / (absw * absw));
        return mulc(z, x);
    }

    //Complex-conjugate
    public static Complex conjugatec(Complex z) {
        return new Complex(z.Re, -z.Im);
    }

    //Power using Complex numbers (including complex Exponents)
    public static Complex pow(Complex z, Complex w) {
        //TODO
        return null;
    }

    //Absolute Value
    public static double abs(Complex z) {
        return z.delt;
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

    public double getDelt() {
        return delt;
    }
}
