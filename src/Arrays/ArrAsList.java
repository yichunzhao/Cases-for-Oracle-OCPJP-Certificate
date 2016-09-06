/*
 * 
 * Collections.unmodifiableList returns a read-only copy of the collections. 
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class ArrAsList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);
        
        List<Double> dList = new ArrayList<>();
        dList.add(33.4d);
        dList.add(34.4d);
        dList.add(53.4d);
        System.out.println(dList);
        
        List<Double> unList = Collections.unmodifiableList(dList);
        unList.add(334343.4d); //UnsupportedOperationException
        
        
    }
}
