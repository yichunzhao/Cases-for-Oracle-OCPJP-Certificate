/**
 * Using BigDecimal.valueOf to create a Big number, instead of using constructor.
 * 
 */
package BigNumber;

import java.math.BigDecimal;

/**
 *
 * @author YNZ
 */
public class UsingStringInit {

    public static void main(String[] args) {
        float f = 1000.1f; 
        BigDecimal bf = new BigDecimal(f);
        System.out.println("" + bf);
        
        double d = 1000.1d;
        BigDecimal bdd = new BigDecimal(d);
        System.out.println("" + bdd);
        
        String val = "1000.1";
        BigDecimal dd = new BigDecimal(val);
        System.out.println("" + dd);
        
        //using static method valueOf() can also sovle this issue. 
        System.out.println(BigDecimal.valueOf(d)); 
    }
}
