package Complex;

public class Complex {
    //Complex/Algebraic Numbers
    //Real and Imaginary part
    double Re;
    double Im;
    double arg;
    double delt;

    //Initializes new Complex number with cartesian Coordinates re and im
    public Complex(double re, double im) {
        Re = re;
        Im = im;
        toPolar();
    }

    //Static-Methods
    //creates new Complex number from Polar coordinates
    public static Complex Polar(double arg, double delt) {
        Complex z = toCartesian();
    }

    public static Complex toCartesian(){
        //TODO
        return null;
    }

    //Addition of Complex Numbers (Cartesian)
    public static Complex addc(Complex z, Complex w) {
        //Complex a = toCartesian(z);
        //Complex b = toCartesian(w);
        return new Complex(z.Re + w.Re, z.Im + w.Im);
    }

    //Subtraction of Complex Numbers (Cartesian)
    public static Complex subc(Complex z, Complex w) {
        Complex x = new Complex(-w.Re, -w.Im);
        return new Complex(z.Re + x.Re, z.Im + x.Im);
    }

    //Multiplication of Complex Numbers (Cartesian)
    public static Complex mulc(Complex z, Complex w) {
        //Complex a = toCartesian(z);
        //Complex b = toCartesian(w);
        return new Complex(z.Re*w.Re - z.Im*w.Im, z.Re*w.Im + z.Im*w.Re);
    }

    public static Complex conjugate(Complex z) {
        //Complex c = toCartesian(z);
        return new Complex(z.Re, -z.Im);
    }

    public static double abs(Complex z) {
        //Complex c = toCartesian(z);
        return Math.sqrt(z.Re*z.Re + z.Im*z.Im);
    }

    public static Complex pow(Complex z, Complex w) {
        //TODO
        return null;
    }

    //Object-Methods
    //initializes Polar-Coordinates of Complex Object
    public void toPolar() {
        //TODO
    }

    public double getRe() {
        return Re;
    }

    public double getIm() {
        return Im;
    }
}
