/*
 * I feel casting is a compiling notification; and telling the jvm, the current
 * scope as fetching method and fields.
 * 
 */
package Casting;

/**
 *
 * @author YNZ
 */
public class InstanceTypeAfterCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double d = 12.0d;

        System.out.println("n type is Number " + Boolean.toString((Number)d instanceof Number));//1
        System.out.println("n type is Double " + Boolean.toString((Number)d instanceof Double));//2
        
        Number n = d;//3
        Double m = (Double)n; //5
        //Double o = n; //6
        
        
    }
}
