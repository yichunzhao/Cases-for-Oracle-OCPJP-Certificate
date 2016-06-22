/*
 * null string is not an Object, for it is referred to any object. 
 * 
 */
package String;

/**
 *
 * @author YNZ
 */
public class NullIsObject {

    static private String str;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("" + str);
        System.out.println("null string is an object " + Boolean.toString(str instanceof Object));
        

    }

}
