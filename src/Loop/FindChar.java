/*
 * find char in an array
 * 
 * 
 */
package Loop;

/**
 *
 * @author YNZ
 */
public class FindChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] cs = {'a', '1', '2', 'e', '*', '/'};
        for (char c : cs) {
            if (Character.isLetter(c)) {
                System.out.print(" " + c);
            }
        }
        System.out.println("\n");
    }
}
