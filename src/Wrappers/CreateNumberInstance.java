/*
 * 
 * instread of using new, using wrapper static method to create a new wrapper instance. 
 * 
 */
package Wrappers;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author YNZ
 */
public class CreateNumberInstance {

    public static void main(String[] args) {
        Double a = Double.valueOf("2.3");
        Double b = Double.valueOf(2.3d);

        if (Objects.equals(a, b)) {
            System.out.println("" + true);
        }
        
        BigDecimal bigA = BigDecimal.valueOf(a);
        System.out.println("big a " + bigA);

    }
}
