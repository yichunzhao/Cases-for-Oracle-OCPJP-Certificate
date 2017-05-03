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
public class StringEqual {

    public static void main(String... args) {
        //string pool, in perm memory
        String s1 = "hello world";
        String s2 = "hello world";
        System.out.println(s1 == s2);

        //new string in heap memory
        String s3 = "i am here";
        String s4 = new String("i am here");
        System.out.println(s3 == s4);

    }

}
