/*
 * Dangling else problem.
 * 
 * JVM will consider the inner if-else caluse as a pair. this will give an un-
 * expected results. 
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class DanglingElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args[0].equals("open")) {
            if (args[0].equals("someone")) {
                System.out.println("Hello!");
            } else {
                System.out.println("Go away " + args[1]);
            }
        }
    }

}
