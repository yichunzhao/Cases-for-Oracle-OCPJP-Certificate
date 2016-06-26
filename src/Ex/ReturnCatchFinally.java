/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

/**
 *
 * @author YNZ
 */
public class ReturnCatchFinally {

    static int inTwoPlaces() {
        String[] students = {"yyy", "zzz"};
        int i =0;
        try {
            System.out.println("" + students[5]);

        } catch (Exception e) {
            System.out.println("exception "+e.getMessage());
            
            return i++;

        }finally{
            
            return i++;
        }

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(""+ReturnCatchFinally.inTwoPlaces());

    }

}
