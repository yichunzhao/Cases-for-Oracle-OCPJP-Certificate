/*
 * How to print a triangle like the following
 *       *
 *      ***
 *     *****  
 */
package Loop;


/**
 *
 * @author YNZ
 */
public class PrintTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] triangle = new char[3][5];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                triangle[i][j + (2 - i)] = '*';
            }
        }

        //print out
        for (char[] row : triangle) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);

            }
            System.out.println("");

        }
    }
}
