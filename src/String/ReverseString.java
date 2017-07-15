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
public class ReverseString {

    public static String reverse(String str) {
        char[] input = str.toCharArray();
        char[] temp = new char[input.length];
        for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
            temp[i] = input[j];
        }
        return String.valueOf(temp);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("" + reverse(str));

        String str1 = "ok";
        System.out.println("" + reverse(str1));

    }

}
