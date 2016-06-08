/*
 * Local var local to its block
 * Method paramter var. local to its method
 * Local var and para. var can not use the same name. just like instance var and
 * class var cannot use the same name. 
 */
package ScopeOfVar;

/**
 *
 * @author YNZ
 */
public class LocalVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 30, b = 20;
        if (a > b) {
            int x = 40;
            System.out.println("" + x);
        } else {
            int x = 60;
            System.out.println("" + x);
        }
        //compiling error, x is not defined outside the block
        //System.out.println(""+x);

    }

}
