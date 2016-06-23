/*
 * switch(x) cannot handle Object type, but String and Enum alone 
 * 
 * in the following case, as input x ='d', case 'd' is triggered, and following
 * down until a break found; all operations will be implemented. 
 * 
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class AcceptObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'd';

        switch (c) {
            case 'd':
                System.out.println("d");
            case 'c':
                System.out.println("c");
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("a");
                break;
            default:
                System.out.println("dd");

        }

    }

}
