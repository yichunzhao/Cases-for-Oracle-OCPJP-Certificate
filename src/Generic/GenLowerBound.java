/*
 * Generics lower bound fx: <? super Integer>
 * 
 * 
 */
package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class GenLowerBound {
    
    public static int sum(List<? super Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);
        }
        return sum;
    }
    
    public static void operateOn(List<? super Integer> a) {
        
    }
    
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        System.out.println("" + sum(nums));
        
        List<Float> nums1 = new ArrayList<>();
        nums1.add(2.0f);
        nums1.add(4.0f);
//        System.out.println("" + sum(nums1));

        List<Object> os = new ArrayList<>();
        os.add(os);
        operateOn(os);
    }
    
}
