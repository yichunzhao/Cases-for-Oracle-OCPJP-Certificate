/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unary;

/**
 *
 * @author YNZ
 */
public class ForLoopUnary {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print(" " + i);
        }
        System.out.println("\n");
        for (int i = 0; i < 3; ++i) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        int i = 0;
        System.out.println("" + i++);

        int j = 0;
        System.out.println("" + (++j));

        int n = 0, m = 0;
        n++; ++m;
        System.out.println("n="+n+ " m= "+ m);
        
        int p,q; 
        p=q=100; //valid
        
        //int x=y=100; //invalid, y is not defined.  
        int x =2;
        x += x++ * x++ * x++; // x= 2 +(2++ * 2++ * 2++)
        //x= 2+(2*3*4) = 2+24 =26
        System.out.println("x="+x);

    }

}
