/*
 * In java, array is a class; int[] getClass [I
 * for int[][] getClass [[I
 * 
 */
package Arrays;

/**
 *
 * @author YNZ
 */
public class ArrayGetClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3},{4,5,6,7},{8,9,10}};
        System.out.println(""+twoD[1].getClass().isArray());
        System.out.println(""+twoD[1].getClass().getName());
        
    }
    
}
