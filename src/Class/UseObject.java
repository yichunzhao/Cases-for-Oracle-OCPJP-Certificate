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
public class UseObject {

    private static String CS = "this is a object";
    
   

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "this is a object";
        String str2 = "this is a object";
        String str3 = new String("this is a object");

        StringBuilder sb = new StringBuilder("this is a object");
        StringBuilder sb1 = new StringBuilder("this is a object");

        System.out.println("getClass return " + str1.getClass()); //return instance class type
        System.out.println("str1 hascode() return " + str1.hashCode());//
        System.out.println("str2 hascode() return " + str2.hashCode());//
        System.out.println("str2 hascode() return " + str3.hashCode());//

        if (str1 == str2) { //equal
            System.out.println("str1=str2");
        }

        if (str2 == str3) {  //not equal
            System.out.println("str2=str3");
        }

        //sb sb1 give distinct hash code.
        System.out.println(sb.getClass());
        String hashCodeStr = String.valueOf(sb.hashCode());
        System.out.println("hashCodeStr " + hashCodeStr);
        if (sb.hashCode() < Integer.MAX_VALUE) {
            System.out.println("in the int. range");
        }
        Integer hashInteger = Integer.valueOf(hashCodeStr, 16);

        System.out.println("convert to Hex");

        System.out.println("sb hash code = " + sb.hashCode());
        System.out.println("sb1 hash code = " + sb1.hashCode());

        //object
        Object obj = new Object();
        System.out.println("object hashcode " + obj.hashCode());

    }

}
