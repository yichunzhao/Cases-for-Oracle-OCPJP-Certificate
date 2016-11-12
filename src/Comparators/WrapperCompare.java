/*
 * From java 7, wrapper classes has been integrated with static compare methods. 
 * when a = b, return 0;
 * when a > b, return 1;
 * when a < b, return -1;
 */
package Comparators;

/**
 *
 * @author YNZ
 */
public class WrapperCompare {
    public static void main (String[] vars){
        System.out.println(Integer.compare(1, 1));
        System.out.println(Integer.compare(1, 2));
        System.out.println(Integer.compare(2, 1));
        
    }
}
