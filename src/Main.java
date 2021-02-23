import Complex.Complex;

public class Main {
    //this is just a test class :D
    public static void main(String[] args) {
        Complex z = new Complex(1, 0);
        Complex w = new Complex(0, 1);
        Complex res = Complex.divc(z, w);
        System.out.println("Re: " + res.getRe() + " Im: " + res.getIm());
    }
}
