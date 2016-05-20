/*
 * 
 * Traverse map for each by its Entry elements.
 * 
 */
package CollectionFun;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class EntryView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Number, String> map = new HashMap<>();
        map.put(1, "this is ");
        map.put(2, "anything possible");
        map.put(2, "whatever it could be");
        map.put(3, "restful webservice");
        map.put(4, "persistence and entity classes");

        Set<Entry<Number, String>> entrySet = map.entrySet();

        for (Entry<Number, String> e : entrySet) {
            System.out.println("key: " + e.getKey() + " value: " + e.getValue());
        }

    }

}
