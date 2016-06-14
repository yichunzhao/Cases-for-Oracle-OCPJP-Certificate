/*
                   #          
                  *# 
                 **# 
                ***#  
               ****# 
              *****# 
 */
package Loop;

/**
 *
 * @author YNZ
 */
public class PrintDownStaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] stairs = new char[6][6];

        for (int i = 0; i < stairs.length; i++) {
            for (int j = stairs[i].length - 1; j >= 0; j--) {
                if (j == stairs[i].length - 1) {
                    stairs[i][j] = '#';
                } else {
                    if (j == (stairs[i].length-1-1 - i)) {
                        break;
                    }
                    stairs[i][j] = '*';
                }
            }
        }

        for (char[] row : stairs) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
            }
            System.out.println("");
        }
    }

}
