/*
 * How many "hello world" instances? 2?
 * 
 * 
 */
package String;

/**
 *
 * @author YNZ
 */
public class StringReference {

    static String str1 = "hello world";
    static String str2 = "hello world";
    static String str3 = "hello world";
    static String str4 = "   hello world ";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (str1 == str2) {
            System.out.println("str1==str2");
            //same obj reference
        }

        if (str2 == str3) {
            System.out.println("str2==str3");
        } else {
            System.out.println("str2!=str3");
            //not the same obj reference 
        }

        if (str2.equals(str3)&str4.trim().equals(str3)) {
            System.out.println("str2.equals(str3)");
            System.out.println("str4.equals(str3)");
            //contains the same text
        }

    }

}
