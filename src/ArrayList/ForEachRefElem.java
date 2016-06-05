/*
 * for each, traverse references of stringBuilder objects.
 * 
 * 
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
        
        System.out.println(""+al);
        
        for(StringBuilder sb : al){
            sb.append(sb.length());
        }
        
        System.out.println(""+al);
        
        
    }
    
}
