/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
class TraverseMap {

    Map<String, Number> map = new HashMap<>(10);
    Random random = new Random(30);

    public TraverseMap() {
        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), random.nextInt(100));
        }
    }

    public Map<String, Number> sort() {
        Map<String, Number> treeMap = new TreeMap<>(map);
        return treeMap;
    }

    public void print() {

        for (Map.Entry<String, Number> entry : map.entrySet()) {
            String key = entry.getKey();
            Number value = entry.getValue();
            System.out.println(key + " " + value.toString());
        }
    }

    public void print(Map<String, Number> map) {
        for (Map.Entry<String, Number> entry : map.entrySet()) {
            String key = entry.getKey();
            Number value = entry.getValue();
            System.out.println(key + " " + value.toString());
        }
    }

    public static void main(String[] args) {
        TraverseMap tm = new TraverseMap();
        tm.print(tm.sort());
        
        double[][] daa = new double[1][1];
        
        System.out.println(daa.length);
    }

}
