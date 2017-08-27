/*
 * String implements <CharSequence> <Comparable> <Seriablizable>
 * 
 * 
 */
package String;

import CollectionFun.Person;
import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class StringContain {

    public static void main(String[] args) {

        String sentence = "paint the cup and the plate";
        System.out.println("" + sentence.contains("the"));
        String content = "Paint the cup and the plate";
        System.out.println("" + sentence.contentEquals(content));
        System.out.println(Arrays.toString(sentence.getBytes()));
        
        Person[] persons = new Person[10];
        System.out.println(""+Arrays.toString(persons));
        
    }

}
