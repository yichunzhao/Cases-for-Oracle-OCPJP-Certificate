/*
 * do and while together
 * 
 * 
 */
package Loop;

/**
 *
 * @author YNZ
 */
public class DoubleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;  //1
        do {
            while (i++ < 5) {
                System.out.println(i);//2
            }
            System.out.println(i);

        } while (i<6);

    }

}
