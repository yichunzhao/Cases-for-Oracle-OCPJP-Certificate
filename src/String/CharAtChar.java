/*
 * char can be considered as a positive integer. 
 * 
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
        String str = new String("Iamok");
        System.out.println("char at charat = " + str.charAt(2));
        System.out.println("sub string 0 2 = " + str.substring(0, 2));

        str.replace('I', 'H');
        //string is immutable
        System.out.println("" + str);
        //return a new string
        System.out.println("" + str.replace('I', 'H'));

    }

}
