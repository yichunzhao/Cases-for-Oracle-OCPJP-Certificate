/*
  * ¨for(initialisation;termination condition; update){
 *     body }
 * 
 */
package Loop;

/**
 *
 * @author YNZ
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int x = 0, y = 10; x < y; x++, --y) {
            System.out.printf(" %d %d ", x, y);
        }
    }

}
