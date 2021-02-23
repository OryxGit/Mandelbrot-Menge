import Complex.Complex;

public class Main {
    //this is just a test class :D
    public static void main(String[] args) {
        double z = Math.E;
        Complex w = new Complex(0, Math.PI);
        Complex x = Complex.pow(z, w);
        System.out.println("Re: " + x.getRe() + " Im: " + x.getIm());
    }
}
