/*
 * HashMap TreeMap both implement Map interface. 
 * HashMap implments hash code of the key value to store the pairs in the map, so having no ordering. 
 * TreeMap implemented in a red-black tree, resorting elements, so having no ordering. 
 */
package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
public class HashMapVsTreeMap {

    public HashMapVsTreeMap() {
    }

    public static void insert(Map<String, String> map) {

        map.put("Monday", "Cleaning dishwasher");
        map.put("Tuesdaqy", "Watering plants");
        map.put("Wensday", "Buying a desk lamp");
        map.put("Thursday", "Adding a new cabinate");
        map.put("Friday", "Go to a cinema");
        map.put("Saturday", "Having a dinner outside");
        map.put("Sunday", "Go to have a fitness training");
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        HashMapVsTreeMap.insert(map);

        System.out.println("HashMap output: " + map);
        map = new TreeMap<>();

        HashMapVsTreeMap.insert(map);
        System.out.println("Treemap output: " + map);
        
        Collection<String> collection = map.values();
        System.out.println("colleciton = " + collection);
        
    }

    
}
