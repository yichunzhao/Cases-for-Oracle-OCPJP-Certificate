/*
 * for each, traverse references of stringBuilder objects.
 * adding reference variable in the list collection.
 * need to watch out string is immutable; on this case, it cannot be modified. 
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class ForEachRefElem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<StringBuilder> al = new ArrayList<>();
        al.add(new StringBuilder("dell"));
        al.add(new StringBuilder("lenovo"));
        al.add(new StringBuilder("IBM"));
        al.add(new StringBuilder("apple"));
        StringBuilder one = new StringBuilder("one");
        al.add(one);
        
        System.out.println(""+al);
        
        for(StringBuilder sb : al){
            sb.append(sb.length());
        }
        
        System.out.println(""+al);
        
        //modify list element externally.
        one.append("extra");
        System.out.println(""+al);
        
        
        
    }
    
}
