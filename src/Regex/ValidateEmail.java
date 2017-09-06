/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

/**
 *
 * @author YNZ
 */
public class ValidateEmail {
    private static final String regx = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void main(String[] args) {
        
        String email1 = "xxx@gmail.com";
        System.out.println("email1 is valid : " + email1.matches(regx));

        String email2 = "xxx@gmail";
        System.out.println("email1 is valid : " + email2.matches(regx));
        
        String email3 = "xxx@";
        System.out.println("email1 is valid : " + email3.matches(regx));
        
        String email4 = "xxx";
        System.out.println("email1 is valid : " + email4.matches(regx));
        
        String email5 = "1223@163.com";
        System.out.println("email1 is valid : " + email5.matches(regx));
    }

}
