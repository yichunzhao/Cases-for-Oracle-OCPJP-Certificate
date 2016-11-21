/*
 * TreeSet sort instered elements. 
 * 
 * 
 */
package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class HashSetOrdering {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Element");
        set.add("Fundamentals");
        set.add("Object");
        
        System.out.println("" +  set);
        
        Set<String> set1 = new TreeSet<>();
        set1.add("Harry");
        set1.add("Element");
        set1.add("Fundamentals");
        set1.add("Object");
        System.out.println("" +  set1);
        
        
    }
    
}
