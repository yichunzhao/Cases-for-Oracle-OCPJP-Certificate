/*
 * sb.insert(int index, char[], int offset, int length)
 * sb.subString(int start, int end) end exclusive.
 * 
 */
package SB;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class SubStr {

    public static void main(String[] args) {

        String str = "scjp sun certified programmer for java 6";

        System.out.println("string substring " + str.substring(0, 4));
        System.out.println("string substring " + str.substring(5));
        System.out.println("char at " + str.charAt(10));
        System.out.println(" " + str.replace('s', 'S'));
        System.out.println("start with" + str.startsWith("Sc"));

        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuilder sb = new StringBuilder(str);

        char[] name = {'Y', 'i', 'c', 'h', 'u', 'n'};

        //insert char array  (position, char[], offset , length)
        sb.insert(0, name, 0, 3);
        System.out.println(sb);

        System.out.println(sb.subSequence(0, 4));

        String strdd = 10 + 2 + "ddd " + 10 + 4;
        System.out.println(strdd);

        String result = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
        System.out.println(result);
        
        String strNull= null;
        String strNull1 = null;
        strNull += "this is null?";
        System.out.println(strNull);
        System.out.println(strNull==strNull1);
        System.out.println(strNull.equals(strNull1));
        System.out.println(strNull instanceof Object);
        
        String strww = "hello world";
        StringBuilder sbb = new StringBuilder(strww);
        System.out.println(sbb.length());
        
        char[] value  = new char[16];
        System.out.println(""+value.length);
        System.out.println(Arrays.toString(value));
        
        int[] value1  = new int[16];
        System.out.println(Arrays.toString(value1));
        
        String[] value2 = new String[16];
        System.out.println(Arrays.toString(value2));
        
        StringBuilder sbbb= new StringBuilder();
        System.out.println(""+sbbb.length());
        
        

    }

}
