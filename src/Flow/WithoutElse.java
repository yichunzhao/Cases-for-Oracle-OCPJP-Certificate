/*
 * if {}; otherwise else missing 'if'. 
 * 
 * 
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class WithoutElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name = "Lion";
        int score = 100;
        if (name.equals("Lion")) score = 200;
        
        //name = "Larry";
        else score = 129;
    }

}
