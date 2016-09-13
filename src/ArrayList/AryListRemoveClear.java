/*
 * 
 * 
 * 
 */
package ArrayList;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class AryListRemoveClear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //list clear(); clearing all elemnents, resulting in size=0; 
        ArrayList<String> al = new ArrayList<>();
        al.add("ae");
        al.add("el");
        al.add("ab");
        al.clear();
        System.out.println(al);
        System.out.println("" + al.size());
        
        //linked list;  
        List<String> list = new LinkedList<>(al);
        list.add("ae");
        list.add("el");
        list.add("ab");
        System.out.println(list);
    }
}
