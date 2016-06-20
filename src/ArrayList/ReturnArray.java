/*
  ArrayList.toArray() returns a copy of elements stored in the ArrayList
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class ReturnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<StringBuilder> al = new ArrayList<>();
        al.add(new StringBuilder("qq"));
        al.add(new StringBuilder("skype"));
        al.add(new StringBuilder("skype"));

        Object[] sbs = al.toArray();
        
        System.out.println(Arrays.toString(sbs));

    }

}
