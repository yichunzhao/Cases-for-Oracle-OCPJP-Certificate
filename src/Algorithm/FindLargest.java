/*
  * find largest one among numbers.
 */

package Algorithm;

/**
 *
 * @author YNZ
 */
public class FindLargest {

    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100, -200, 300};
        System.out.println("largest = " + findLargest(nums));
    }
}
