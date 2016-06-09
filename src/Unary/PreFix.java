/*
 *   int a = 10;
 *   a = ++a + a + --a - --a + a++;
 */

package Unary;

/**
 *
 * @author YNZ
 */
public class PreFix {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        a = ++a + a + --a - --a + a++;
        // a = 11 + 11 + 10 - 9 + 9
        System.out.println(a);
    }
}
