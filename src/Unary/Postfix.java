/*
 * postfix(++ --) has a higher procedence than * 
 * 
 * x++ -> x=x+1     note: x will be re-assigned a new value. 
 */
package Unary;

/**
 *
 * @author YNZ
 */
public class Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        x += x++ * x++ * x++; // x= 2 +(2++ * 2++ * 2++)
        //x= 2+(2*3*4) = 2+24 =26
        System.out.println("x=" + x);
    }

}
