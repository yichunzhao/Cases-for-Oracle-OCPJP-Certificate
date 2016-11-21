/*
 * TreeSet: not ordering, no dupicated, and sorted. 
 * 
 * 
 */
package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class TreeSetSortAndUnique {

    public static void main(String[] args) {
        String str = "Object-oriented software construction";
        System.out.println(Arrays.toString(str.toCharArray()));
        Set<Character> charSet = new HashSet<>();
        
        for(Character c : str.toCharArray()){
            charSet.add(c);
        }
        System.out.println("char set: "+ charSet);

    }

}
