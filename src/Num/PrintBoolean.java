/*
 * operator + has two meanings; 1) plus  2) concate
 * as using with string before or after, then you need to watch out it is concate
 * using brace to isolate them. 
 */
package Num;

/**
 *
 * @author YNZ
 */
public class PrintBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a = 10, b = 20;
        System.out.println("" + (a > b));
        
        //using brace to do non-concate operation first. 
        String str = null;
        System.out.println("string null is a string instance "+ (str instanceof String));
        System.out.println("string null is a string instance "+ (str instanceof Object));
    }

}
