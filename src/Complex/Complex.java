package Complex;

public class Complex {
    //Complex/Algebraic Numbers
    //Real and Imaginary part, Argument and Absolute Value (Distance from Origin)
    private final double Re;
    private final double Im;
    private final double arg;
    private final double abs;

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
            throw new ArithmeticException("Division by 0!");
        return Polar(z.arg - w.arg, z.abs / w.abs);
    }

    //Division of Complex and Real Numbers
    public static Complex div(Complex z, double w) {
        if (w == 0)
            throw new ArithmeticException("Division by 0!");
        return Polar(z.arg, z.abs / w);
    }

    public static Complex div(double z, Complex w) {
        if (w.abs == 0)
            throw new ArithmeticException("Division by 0!");
        return Polar(-w.arg, z / w.abs);
    }

    //Division of Real Numbers
    public static Complex div(double z, double w) {
        if (w == 0)
            throw new ArithmeticException("Division by 0!");
        return Polar(0, z / w);
    }

    //Format: z^w
    //Power of Complex numbers
    public static Complex pow(Complex z, Complex w) {
        if (z.abs == 0 && w.abs == 0)
            throw new ArithmeticException("0^0 is undefined!");
        else if (z.abs == 0)
            return new Complex(0, 0);
        else if (w.abs == 0)
            return new Complex(1, 0);
        else
            return Polar(z.arg * w.Re + Math.log(z.abs) * w.Im,
                    Math.pow(z.abs, w.Re) * Math.pow(Math.E, -z.arg * w.Im));
    }

    //Power of Complex and Real Numbers
    public static Complex pow(Complex z, double w) {
        if (z.abs == 0 && w == 0)
            throw new ArithmeticException("0^0 is undefined!");
        else if (z.abs == 0)
            return new Complex(0, 0);
        else if (w == 0)
            return new Complex(1, 0);
        else
            return Polar(z.arg * w, Math.pow(z.abs, w));
    }

    public static Complex pow(double z, Complex w) {
        if (z == 0 && w.abs == 0)
            throw new ArithmeticException("0^0 is undefined!");
        else if (z == 0)
            return new Complex(0, 0);
        else if (w.abs == 0)
            return new Complex(1, 0);
        else if (z > 0)
            return Polar(Math.log(z) * w.Im, Math.pow(z, w.Re));
        else
            return Polar(Math.log(-z) * w.Im, Math.pow(z, w.Re) * Math.pow(Math.E, -Math.PI * w.Im));
    }

    //Power of Real Numbers
    public static Complex pow(double z, double w) {
        if (z == 0 && w == 0)
            throw new ArithmeticException("0^0 is undefined!");
        else
            return new Complex(Math.pow(z, w), 0);
    }

    //Complex-conjugate
    public static Complex conjugate(Complex z) {
        return new Complex(z.Re, -z.Im);
    }

    //Absolute Value
    public static double abs(Complex z) {
        return z.abs;
    }

    //Checks if two Complex Numbers are equal
    public static boolean equals(Complex z, Complex w) {
        return z.Re == w.Re && z.Im == w.Im;
    }

    //Object-Methods
    public boolean equals(Complex z) {
        return Re == z.Re && Im == z.Im;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("Cartesian: ");
        toString.append(Re);
        toString.append("+");
        toString.append(Im);
        toString.append("i");
        toString.append(" Polar: ");
        toString.append(abs);
        toString.append("e^(");
        toString.append(arg);
        toString.append(")");
        return toString.toString();
    }

    public double toDouble() {
        if (Im != 0) {
            throw new ArithmeticException("Can not convert a Complex Number to a real Number");
        }
        return abs;
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