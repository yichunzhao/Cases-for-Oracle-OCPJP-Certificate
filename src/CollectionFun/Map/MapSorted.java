/*
 * Map is an interface; it is not a collection. 
 * Map impl. HashMap, LinkedHshMap; and TreeSet. 
 * hash map and tree map is not ordered. insertion order not equal to retrieval order. 
 * linked map it is orderd. 
 */
package CollectionFun.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
public class MapSorted {

    public static void main(String... args) {

        Map<String, Number> mapHash = new HashMap<>();
        Map<String, Number> mapTree = new TreeMap<>();
        Map<String, Number> mapLinked = new LinkedHashMap<>();

        List<Number> values = Arrays.asList(40, 29, 20);
        List<String> keys = Arrays.asList("Paul", "Shreya", "Selvan");

        for (int i = 0; i < keys.size(); i++) {
            mapHash.put(keys.get(i), values.get(i));
            mapTree.put(keys.get(i), values.get(i));
            mapLinked.put(keys.get(i), values.get(i));
        }

        System.out.println("hash   " + mapHash.toString());
        System.out.println("linked " + mapLinked.toString());
        System.out.println("tree   " + mapTree.toString());

    }

}
