/*
 * How many "hello world" instances? 2?
 * String pass by referemce?? not exaclty.  
 * String is immuatable. String is stored in heap memory, String pool. Once it is
 * is constructed, then it will not be changed.  A text modification will results
 * in a new String instance in the String pool, and String refernce will be moved
 * and pionted to a new String instance. This is so called immuatable. 
 * In the con-currecy context, clients using the same String won't worry the 
 * underlying String object could be modified by the third parties. 
 * ArrayList do pass by reference. however it won't generate a new instance when
 * it is added or removed an element. 
 * 
 * The primitive passed by the values(Copy); They needs to be returned from the
 * methods. (byte,char,short,int,double,float,double,boolean); 
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

    public static void changeIt(String str) {
        str += " changed!";
        System.out.println("in changIt " + str);
    }

    public static void changeItNew(String str) {
        str += " changed!";
        System.out.println("in changIt " + str);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "I am in the main()  ";

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

        if (str2.equals(str3) & str4.trim().equals(str3)) {
            System.out.println("str2.equals(str3)");
            System.out.println("str4.equals(str3)");
            //contains the same text
        }

        //change a String in a method.
        //str reference cannot be changed in the method. 
        //within the method str is reffered by a copy of passed the str reference.
        changeIt(str);
        System.out.println("after changeIt() " + str);
        

    }

}
