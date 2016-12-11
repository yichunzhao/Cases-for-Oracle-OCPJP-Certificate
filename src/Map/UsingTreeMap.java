/*
 * TreeMap is sorted according to natural ordering of the key. 
 * key object implements comparable interface.  
 * it offers log(n) cost as using put(), get(), remove().  
 */
package Map;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
public class UsingTreeMap {

    private static Map<String, String> map = new TreeMap<>();

    public static void main(String[] args) {
        map.put("one", "java persistence with jpa");
        map.put("two", "java generics and collections");
        map.put("three", "building restful web service with spring");
        map.put("four", "introduction to java programming");
        
        System.out.println("map content: "+ map);
        
        map.replace("four", "my book");
        System.out.println("map content: "+ map);

    }

}
