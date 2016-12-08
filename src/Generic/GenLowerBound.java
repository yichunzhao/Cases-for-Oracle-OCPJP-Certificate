/*
 * Generics lower bound fx: <? super Integer>
 * 
 * 
 */
package Generic;

import java.util.List;

/**
 *
 * @author YNZ
 */
public class GenLowerBound {

    public static int sum(List<? super Integer> list) {
        int sum = 0; 
        for (int i = 0; i < list.size(); i++) {
            sum += (int)list.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
       double i = 1.0E10;
    }

}
