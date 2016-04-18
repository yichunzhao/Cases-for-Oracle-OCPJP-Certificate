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
public class Impl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10;
        int n=i++%5;
        System.out.println("i="+i); //i++ evaluate i's orignal value; afterwards, i = i+1
        System.out.println(n);
        
        System.out.println(i%3);
    }
    
}
