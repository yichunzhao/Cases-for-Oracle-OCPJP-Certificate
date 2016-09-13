/*
 * hashmap is sorted. (sorted by hashcode() and equals())
 * linkedhashmap is ordered.(perserving inserting order)
 * treeMap is sorted by comparing(comparable or comparator)
 */
package CollectionFun.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
public class MapNoOrder {

    public static void main(String[] args) {
        //HashMap has no order 
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Paul", 32222.88);
        salaryMap.put("Smith", 43333.98);
        salaryMap.put("Chris", 45556.98);
        salaryMap.put("Paul", 32222.88);

        System.out.println(salaryMap);

        //LinkedHashMap is a 
        Map<String, Double> salaryMap1 = new LinkedHashMap<>();
        salaryMap1.put("Paul", 32222.88);
        salaryMap1.put("Smith", 43333.98);
        salaryMap1.put("Chris", 45556.98);
        System.out.println(salaryMap1);

        //TreeMap is sorted by its natural sequence. 
        Map<String, Double> salaryMap2 = new TreeMap<>();
        salaryMap2.put("Paul", 32222.88);
        salaryMap2.put("Smith", 43333.98);
        salaryMap2.put("Chris", 45556.98);
        salaryMap2.put("Paul", 32222.88);
        System.out.println(salaryMap2);

        for (Entry<String, Double> e : salaryMap2.entrySet()) {
            if (e.getKey().equals("Paul")) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
