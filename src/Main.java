import Complex.Complex;

public class Main {
    //this is just a test class :D
    public static void main(String[] args) {
        double c = 0.25;
        double zn = c;
        for (int i = 0; i < 100; i++) {
            zn = Complex.pow(zn, 2).toDouble() + c;
        }
        System.out.println(zn);
    }
}
