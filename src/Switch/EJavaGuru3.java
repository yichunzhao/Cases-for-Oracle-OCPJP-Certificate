/*
 * in absence of break, what happends?
 * it will fall in following cases, until find a break.
 * 
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class EJavaGuru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        byte foo = 120;
        switch (foo) {
            default:
                System.out.println("ejavaguru");
                break;
            case 2:
                System.out.println("e");
                break;
            case 120:
                System.out.println("ejava");
            case 121:
                System.out.println("enum");
            case 127:
                System.out.println("guru");
                break;
        }
    }
}

