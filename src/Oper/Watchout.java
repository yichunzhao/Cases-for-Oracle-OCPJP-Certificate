/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oper;

/**
 *
 * @author YNZ
 */
public class Watchout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                i=m++;
                System.out.println("i="+i);
                System.out.println("m="+m);

            }
            m++;
        }
        System.out.println(k + ", " + m);
    }

}
