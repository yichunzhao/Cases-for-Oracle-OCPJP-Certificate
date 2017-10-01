/*
 * Internally, key -> hash function -> index --> an array of buckets. 
 * If inputting two key.value with the same key; they both will be assigned
 * into the same bucket. The previous one is therefore overwritten.  
 * 
 * Please note: each bucket contains a linked List. When two different key, but 
 * having the same hash value, then the latest one will be inserted into linked liist. 
 * they both still have the same bucket index. 
 */
package CollectionFun.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class HashMapDuplicatedEele {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key1", 20);
        map.put(null, 30);

        System.out.println(map);
        System.out.println("" + map.get(0).toString());
    }

}
