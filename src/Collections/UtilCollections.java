/*
 * Java util service class, Collections
 *  java Number class is a abtract class, which doesn't implements Comparable 
   interface. Collections.sort() must sort comparables  
 * 
 * 
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class UtilCollections {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(9);
        numbers.add(29);
        numbers.add(1);

        System.out.println("numbers : " + numbers);
        Collections.sort(numbers);
        System.out.println("numbers : " + numbers);
        
        int what = Collections.binarySearch(numbers, 29);
        System.out.println("what is " + what);

    }

}
