/*
 * un-allocated array, = null. 
 * it won't cause null pointer exception, but print out null 
 * 
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class NonAllocatedAry {

    private int[] nums;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NonAllocatedAry allocatedAry = new NonAllocatedAry();
        System.out.println(Arrays.toString(allocatedAry.nums));
        
        NonAllocatedAry allocatedAry1 = new NonAllocatedAry();
        System.out.println(Arrays.toString(allocatedAry1.nums));
        
        //null pointer exception is runtime unchecked exception. 
        int l = allocatedAry1.nums.length;
    }

}
