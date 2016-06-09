/*
 * Can we find a max in a number list from the head and tail together?
 * 
 * I made this experience.
 */
package Algorithm;

/**
 *
 * @author YNZ
 */
public class DoubleWayMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 8, 9, 10, 123, 39, -10};
        int max1 = nums[0];
        int max2 = nums[nums.length - 1];
        long start = System.currentTimeMillis();
        for (int i = 1, j = nums.length - 2; i <= j; ++i, --j) {
            if (nums[i] > max1) {
                max1 = nums[i];
            }
            if (nums[j] > max2) {
                max2 = nums[j];
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("max " + Math.max(max1, max2) + " time = " + (end - start));

    }
}
