/*
 * while termination condition = true; may causing un-reachable statements. 
 * 
 * 
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class WhileMissingBrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            System.out.println("add");
        }
        System.out.println("following");
    }

}
