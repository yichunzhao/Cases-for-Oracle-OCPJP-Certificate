/*
 * Arrays.sort() 
 * 
 * array transfered by a copy or reference? 
 * 
 */
package Sort;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class ArraysSort {
    
    public static void main(String[] args) {
        int[] intArray = {20, 30, 40 ,65, 23, 12};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        
    }
    
}
