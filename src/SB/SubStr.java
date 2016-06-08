/*
 * sb.insert(int index, char[], int offset, int length)
 * sb.subString(int start, int end) end exclusive.
 * 
 */
package SB;

/**
 *
 * @author YNZ
 */
public class SubStr {

    public static void main(String[] args) {

        String str = "scjp sun certified programmer for java 6";

        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuilder sb = new StringBuilder(str);

        char[] name = {'Y', 'i', 'c', 'h', 'u', 'n'};
        
        //insert char array  (position, char[], offset , length)
        sb.insert(0,name,0,3);
        System.out.println(sb);
        
        System.out.println(sb.subSequence(0, 4));

    }

}
