/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author YNZ
 */
class ArrayTest {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws NullPointerException {

        try {
            int ia[][] = {{1, 2}, null};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(ia[i][j]);
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
    }
}
