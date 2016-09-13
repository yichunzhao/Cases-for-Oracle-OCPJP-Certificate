/*
 * 
 * using setScale(number of decimals, rounding mode) making decimal number rounded. 
 * 
 */
package BigNumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author YNZ
 */
public class BigNumberRounding {

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(String.valueOf(12.346377545)).setScale(5, RoundingMode.HALF_UP);
        System.out.println("" + bd);
    }
}
