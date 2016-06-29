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
public class ShortCircuit {

    static boolean a;
    static boolean b;
    static boolean c;

    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
        //System.out.println (""+bool);//System.out.println
    }

}
