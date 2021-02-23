import Complex.Complex;

public class Main {
    //this is just a test class :D
    public static void main(String[] args) {
        Complex z = new Complex(-1, 0);
        Complex w = new Complex(1, 1);
        Complex x = Complex.pow(0, 0);
        System.out.println("Re: " + x.getRe() + " Im: " + x.getIm());
    }
}
