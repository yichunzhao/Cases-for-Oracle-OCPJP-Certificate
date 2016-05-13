/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrecisionLoss;

/**
 *
 * @author YNZ
 */
public class Loss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1234567890;
        //if you asssingn a integer to float
        float b = a;
        double c = a;
        System.out.println("b=" + b);
        System.out.println("c=" + c); // closer than using float.
        System.out.println("(int)b=" + (int) b);
        //float record 9 significant digit after decimal
        System.out.println(a - (int) b);
        //double gives a better accuracy. 
        System.out.println(a - (int) c);
        
        
    }

}
