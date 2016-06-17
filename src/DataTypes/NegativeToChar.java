/*
 * you cannot assign a negative number to char var. without casting. 
 * 
 * 
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
public class NegativeToChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = (char)-1;
        System.out.println(c);
        Character ch = c;
        System.out.println(ch.compareTo((char)1));
        
        
    }
    
}
