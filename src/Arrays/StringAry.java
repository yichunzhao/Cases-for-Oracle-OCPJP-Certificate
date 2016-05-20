/*
 * Converting an array into list
 * sort using until colection services.
 */
package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class StringAry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strs = {"Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum"};
        System.out.println(Arrays.toString(strs));//1 
        
        List<String> list = Arrays.asList(strs);
        System.out.println(list); //2 
        
        Collections.sort(list);
        System.out.println(list); //3 sort from a to z
        
        Collections.reverse(list);
        System.out.println(list);//4 reverse
        
        //checking an elem. in an array. 
        System.out.println("strs contains \"Orange\" "+list.contains("Orange"));
    }
}
