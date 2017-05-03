/*
 * two char array contains same chars (maybe not in the same seq.)
 * 
 * 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class CharArrayContainSame {
    // elements in 'a' is contained in 'b'?
    public static boolean contain(String a, String b) {
        boolean result = true;

        for (char ea : a.toCharArray()) {
            result &= sumBoolean(locateCharInStr(ea, b));
        }

        return result;
    }

    //convert a string into a list of char
    public static List<Character> str2list(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list;
    }

    //identify a char if within in a String
    public static boolean[] locateCharInStr(char c, String str) {
        boolean[] ba = new boolean[str.length()];
        char[] ca = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ca[i] == c) {
                ba[i] = true;
            }
        }

        return ba;
    }

    public static boolean sumBoolean(boolean[] b) {
        boolean result = false;
        for (boolean be : b) {
            if (be == true) {
                result = result | be;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "team";
        String str2 = "team";

        List<Character> list1 = str2list(str1);
        List<Character> list2 = str2list(str2);
        System.out.println("contains all : " + list1.containsAll(list2));

        boolean[] ba = locateCharInStr('m', "");
        System.out.println(Arrays.toString(ba));

        ba = locateCharInStr('t', "teamm");
        System.out.println(Arrays.toString(ba));
        System.out.println("" + sumBoolean(ba));
        
        
        System.out.println(String.valueOf(contain("were ", "we are team as")));

    }

}
