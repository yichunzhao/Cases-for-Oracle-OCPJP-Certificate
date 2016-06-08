/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class RemoveEle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("ae");
        al.add("ce");
        al.add("ae");
        al.add("aa");
        al.add("bb");

        System.out.println("" + al.toString());
        System.out.println(al.remove("ae"));
        System.out.println("" + al.toString());

        al.contains("ae");
        System.out.println("contain ae " + al.contains("ae"));
        
        //remove the first occurence of object
        al.add("ae");
        System.out.println("" + al.toString());
        
        al.remove("ae");
        System.out.println("" + al.toString());
        
        al.remove(new String("ae"));
        System.out.println("" + al.toString());
    }
}

