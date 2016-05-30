/*
   Emerge two array to gether

        int[] arr1 = {1,2,3,8,10,100};  
        int[] arr2 = {17,18,19,21,1001}; 

   the resultant array should be {1, 2, 3, 8, 10, 17, 18, 19, 21, 100, 1001}
 */
package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class EmergeTwoAry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 10, 100};
        int[] arr2 = {17, 18, 19, 21, 1001};

        List list = new ArrayList(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        for (Iterator it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

    
                
                
    }

}
