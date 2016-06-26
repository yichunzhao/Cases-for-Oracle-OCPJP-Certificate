/*
 * java.lang.ExceptionInInitializerError
 * 
 */
package Ex;

/**
 *
 * @author YNZ
 */
public class InitEx {

    static int[] a = new int[3];

    private int[] b = new int[2];

    static {
        a[4] = 10;
    }

    {
        b[4] = 10;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InitEx ex = new InitEx();

    }

}
