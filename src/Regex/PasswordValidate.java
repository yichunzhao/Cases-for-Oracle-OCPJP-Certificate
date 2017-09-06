/*
 * And the password is strong enough (has one capital letter and one number)
 * 
 * 
 */
package Regex;

/**
 *
 * @author YNZ
 */
public class PasswordValidate {

    public static void main(String[] args) {
        String pwd0 = "dell";
        String pwd1 = "Q343433rtfg9_";
        String pwd2 = "19GDddss";
        String pwd3 = "2017Well";
        String pwd4 = "Well2017";
        String pwd5 = "W1212qwerty1212";
        String pwd6 = "aasddW12121212";
        

        //String regx = "^(?=(.*\\d){1})(.*\\S)(?=.*[A-Z\\S])[a-z\\S]{3,}";
        //String regx = "((?=.*\\d)(?=.*[a-z_])(?=.*[A-Z])(.{8,}))";
        String regx = "^((?=.*\\d)(?=.*[a-z_])(?=.*[A-Z])(.{8,}))$";
        
        //String regx = "([\\d]+)([a-z]+)([A-Z]+)(.{8,})";
        //String regx = "([A-Z]+)([\\d]+)([a-z]*)(.{8,})";

        System.out.println(pwd0.matches(regx));
        System.out.println(pwd1.matches(regx));
        System.out.println(pwd2.matches(regx));
        System.out.println(pwd3.matches(regx));
        System.out.println(pwd4.matches(regx));
        System.out.println(pwd5.matches(regx));
        System.out.println(pwd6.matches(regx));

    }

}
