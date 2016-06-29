/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author YNZ
 */
public class Indexof {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7)); //1
        System.out.println(s.substring(5)); //2
        System.out.println(s.substring(s.indexOf('I', 3))); //3
        System.out.println(s.substring(s.indexOf('I', 4))); //4
        
        //java identifier are case sensitive
        int per, Per;

    }

}
