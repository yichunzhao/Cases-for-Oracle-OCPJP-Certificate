/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Num;

import java.util.Date;

/**
 *
 * @author YNZ
 */
public class ParseStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number = "12.34";
        float num = Float.parseFloat(number);
        System.out.println("" + num);
        

        Float f = Float.valueOf(number);
        float b = Float.valueOf(number);
        
        Number d = 1d;
        System.out.println(d instanceof Double); 

    }

}
