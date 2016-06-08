/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SB;

/**
 *
 * @author YNZ
 */
public class AppendSb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        char[] name = {'J', 'a', 'v', 'a', '7'};
        sb1.append(name, 1, 3);
        System.out.println(sb1);
        sb1.insert(0, name, 1, 2);
        System.out.println(sb1);
        
        
    }

}
