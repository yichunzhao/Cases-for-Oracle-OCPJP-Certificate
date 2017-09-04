/*
 * 
 * ArrayList to Array
 * 1) Casting  2) Generic method 
 * 
 */
package ArrayList;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class List2Array {
    
    public static void main(String[] args) {
        
        List<BigDecimal> list = Arrays.asList(
                BigDecimal.valueOf(0),BigDecimal.valueOf(10),
                BigDecimal.valueOf(20),BigDecimal.valueOf(30)
        );
        
        BigDecimal[] bds = (BigDecimal[]) list.toArray();
        System.out.println("" + Arrays.toString(bds));
        
        BigDecimal [] holder = new BigDecimal[list.size()-1];
        holder = list.toArray(holder);
        System.out.println("" + Arrays.toString(holder));
        
    }
    
}
