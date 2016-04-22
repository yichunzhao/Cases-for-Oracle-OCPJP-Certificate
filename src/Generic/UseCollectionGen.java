/*
 * Java collection use a lot of Generic. I feel container or box object my involve
 * using Generic a lot.  The user of a box may put differnt object into it. Do 
 * you need to secure your code? Then you need Generic.  
 */
package Generic;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class UseCollectionGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map map = Collections.synchronizedSortedMap(new TreeMap<String,Float>());
        //map=Collections.synchr½onizedSortedMap(map);
        map.put(new Double("12"), 1.2F);
        
        
        
    }
    
}
