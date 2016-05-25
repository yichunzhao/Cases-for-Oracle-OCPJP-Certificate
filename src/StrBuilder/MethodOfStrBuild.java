/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrBuilder;

/**
 *
 * @author YNZ
 */
public class MethodOfStrBuild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("hellow world");
        sb.append(sb1);
        sb.trimToSize();
        System.out.println(""+sb.toString());
        sb.reverse();
        System.out.println(""+sb.toString());
    }
    
}
