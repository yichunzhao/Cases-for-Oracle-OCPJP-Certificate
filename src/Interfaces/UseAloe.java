/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author YNZ
 */
public class UseAloe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aloe a = new Aloe("this is a test string!");
        
        System.out.println("char at 3= "+a.charAt(0));
        System.out.println("char at 3= "+a.charAt(3));
        System.out.println("char at 13= "+a.charAt(13));
        System.out.println("aloe substring="+a.subSequence(3, 13));
        System.out.println("aloe substring length="+a.subSequence(3, 13).length()); //sub-string length = end - start. end is end label, but not included. 
        System.out.println("aloe length=" + a.length());
        
    }
    
}
