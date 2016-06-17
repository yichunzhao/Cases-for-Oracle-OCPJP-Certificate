/*
 * can switch(i) accept object type? Object IS_A one of followings? no. 
 * 
 * i could be only be primitive type: byte char short int;  
 * reference type: String and Enum. 
 * 
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class AcceptObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char i = 'a';
        
        switch(i){
            default:System.out.println("dd");
        }
        
    }
    
}
