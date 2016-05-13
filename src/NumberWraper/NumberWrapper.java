/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberWraper;

/**
 *
 * @author YNZ
 */
public class NumberWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = 20;
        Float f = 20f;
        Integer j = 20;
        
        //1
        System.out.println("i equal f ?" + i.equals(f));
        System.out.println("i equal j ?" + i.equals(j));
        
        //2
        System.out.println("i-f = " + (f - i));

    }

}
