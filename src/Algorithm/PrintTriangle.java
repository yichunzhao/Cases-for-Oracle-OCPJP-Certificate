/*
 * print out a triangle(7*7) 
 * 
 * 
 */
package Algorithm;

/**
 *
 * @author YNZ
 */
public class PrintTriangle {

    public PrintTriangle() {
    }

    public static void main(String[] args) {
        char[] signs = new char[7];
        for (int i = 0; i < signs.length; i++) {
            signs[i] = '*';
        }

        for (int p = 0; p < signs.length; p++) {
            for (int q = 0; q <= p; q++) {
                //System.out.print(p);
                System.out.print("" + signs[q]);
            }
            System.out.println("");

        }

    }

}
