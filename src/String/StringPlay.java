/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class StringPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloString.concat(helloString));

        String sb = "whoamI?";
        System.out.println(sb.length());
        String s1 = sb.substring(1);

        System.out.println(s1);

        String str1 = "text";
        String str2 = "text";
        System.out.println("st1= "+str1.hashCode() +" str2= "+ str2.hashCode() ); 
        System.out.println("str1==str2 is " + (str1==str2));
        System.out.println("str1 equal str2 is " + str1.equals(str2));
        System.out.println("chart at -1 what happens? " + str1.charAt(1));//index 0 to length-1
        System.out.println("str length "+ str1.length()); 
        
        str1+="";
        
        
        

    }

}
