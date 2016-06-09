/*
 * 
 * How to swap two numbers without using temp. var. 
 * 
 */
package Algorithm;

import java.util.Arrays;

/**
 * @author YNZ
 */
public class Swap2Num {

    public static <T> void swap(T[] nums) {
        T a = nums[1], b = nums[0];
        nums[0] = a;
        nums[1] = b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] nums = new Integer[2];
        int a = 10;
        int b = 20;
        nums[0] = a;
        nums[1] = b;
        System.out.println(Arrays.toString(nums));
        swap(nums);
        System.out.println(Arrays.toString(nums));
    }

}
