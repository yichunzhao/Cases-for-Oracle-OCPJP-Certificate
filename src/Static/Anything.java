/*
 * static block should be implemented as class is loaded; then constructor.
 * not exaclty from the outputs.
 */
package Static;

/**
 *
 * @author YNZ
 */
public class Anything {

    public static final double A1 = 3.1415926;
    public static double A2;
    public short s1;

    public Anything() {
        A2 = 3.67;
        System.out.println("A2=" + A2);
    }

    static {
        double A2 = 3.56;
        System.out.println("A2=" + A2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anything at = new Anything();

        System.out.println(Anything.A1);
        System.out.println(at.A2);

    }

}
