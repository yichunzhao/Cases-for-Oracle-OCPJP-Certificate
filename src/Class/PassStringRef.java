/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author YNZ
 */
public class PassStringRef {

    static String str = "Hello World";

    public static void changeIt(String s) {
        s = "Good bye world";
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }


}
