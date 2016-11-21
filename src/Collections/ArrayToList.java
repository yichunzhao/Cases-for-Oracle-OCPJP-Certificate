/*
 * Arrays.asList requires var. args. 
 * TreeSet mains a natrual order(sorted) 
 * 
 */
package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class ArrayToList {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'b', 'd', 'a', 'd', 'f', 'd');
        System.out.println("" + list);

        
        String str = "fundamentals";
        char[] x = str.toCharArray();
        //asList(T ...a) takes a generic type. 
        //char[] array is not primitive type. 
        List<char[]> asList = Arrays.asList(x);
        
        //get a list contains one char[] element. 
        System.out.println("size of asList = " +asList.size());
        
        String phrase = "This site uses cookies from Google to deliver its services";
        String[] strs = phrase.split(" "); 
        
        List<String> words = Arrays.asList(strs);
        Set<String> tSet = new TreeSet<>(words);
        System.out.println("size of tSet = " +asList.size());
        System.out.println(""+tSet);
        
    }

}
