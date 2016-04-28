/*
 * Can string chart at teking a 'char' as its input argument?
 * Yes, it can. for the char will be considered as an integer.
 * Whatever, it may cause string out index bound exception. 
 */
package String;

/**
 *
 * @author YNZ
 */
public class CharAtChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = new String("I am ok");
        System.out.println("char at charat = " + str.charAt('a'));

    }

}
