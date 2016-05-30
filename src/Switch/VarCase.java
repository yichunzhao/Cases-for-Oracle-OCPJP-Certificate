/*
 * variable case number.
 * 
 * 
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class VarCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int a=20, b=10;
        int x = a + b;
        switch (x) {
            case a + b:
                System.out.println("" + (a + b));
                break;
        }

    }

}
