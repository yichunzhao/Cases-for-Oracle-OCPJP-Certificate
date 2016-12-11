/*
 * 
 * Collections.sort()
 * 
 */
package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class CollectionSort {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10, 12, 23, 9, 45);
        System.out.println(""+list);
        Collections.sort(list);
        System.out.println(""+list);
        
    }
}
