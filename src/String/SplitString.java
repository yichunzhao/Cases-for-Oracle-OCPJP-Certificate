/*
 * String split() method
 * 
 * 
 */
package String;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class SplitString {

    public static void main(String[] args) {
        String str = "this_string_split";
        String[] strs = str.split("_");
        System.out.println(Arrays.toString(strs));
        
        String fn = "model.txt";
        String[] xx = fn.split("//.");
        System.out.println(Arrays.toString(xx));
        
    }

}
