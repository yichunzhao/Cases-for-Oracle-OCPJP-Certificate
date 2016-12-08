/*
 * what happends as adding same keys into map
 * (1) the same pair overwrite each other.  
 * (2) how about the same key but differnt value? getting the same conclusion as 1)
 * same hashcode will be re-calcuated into the same index number. 
 * then question, how Hashmap sholve hashcode confliction?
 * hashmap invoking hascode() first, if they are the same, then hashmap invoking
 * equal() method to compare two key objects. if they are the same, then overwriting. 
 * otherwise, propose a new index number. 
 */
package Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class AddingSameKeys {

    private static Map<String, Integer> map;

    static {
        map = new HashMap<>();
    }

    public static void main(String[] args) {
        map.put("one", 1);
        map.put("one", 1);
        
        map.put("three", 3);
        map.put("three", 4);
        System.out.println("" + map);
        
        System.out.println("three".hashCode());

    }

}
