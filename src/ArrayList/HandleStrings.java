/*
 * String is immutable, so it cannot be pointed to antoher string. 
 * ArrayList remove the first occurance of the specified object. 
 * ArrayList keeps the insertion order. 
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class HandleStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        strs.add("dell");
        strs.add("monitor");
        strs.add("iphone");
        strs.add("hello");
        
        for(String str:strs){
            if(str.equals("dell")){
                str = "IBM";
            }
        }
        
        System.out.println(strs);
        System.out.println(""+ strs.indexOf("hello"));
        
        //remove one duplicated "hello"
        strs.remove("hello");
        //the first occurance of "hello" being removed. 
        System.out.println(strs);
        System.out.println(""+ strs.indexOf("hello"));
        
        
    }
    
}
