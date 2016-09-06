/*
 * 
 * instread of using new, using wrapper static method to create a new wrapper instance. 
 * 
 */
package Wrappers;

/**
 *
 * @author YNZ
 */
public class CreateNumberInstance {

    public static void main(String[] args) {
        Double a = Double.valueOf("2.3");
        Double b = Double.valueOf(2.3d);

        if (a == b) {
            System.out.println("" + true);
        }

    }
}
