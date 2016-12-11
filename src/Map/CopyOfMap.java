/*
 * Generics doesn't support subtyping. Map accepts Map in constructor
 * 
 * 
 */
package Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class CopyOfMap {
    
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Tom", 12334.33);
        salaryMap.put("Mike", 433542.84);
        
        Map<String, Double> copySalaryMap = new HashMap<>(salaryMap);
        System.out.println("" + copySalaryMap);
        
      
    }
}
