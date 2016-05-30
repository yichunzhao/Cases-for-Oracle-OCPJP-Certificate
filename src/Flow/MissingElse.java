/*
 * 
 * valid to miss else. 
 * 
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class MissingElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long dayCount = 31;
        if (dayCount == 28 || dayCount == 29) {
            System.out.println("Feb");
        } else if (dayCount == 30) {
            System.out.println("Apr");
        } else if (dayCount == 31) {
            System.out.println("Jan");
        }
    }

}
