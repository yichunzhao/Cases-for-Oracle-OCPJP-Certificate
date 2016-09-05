/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberWraper;

/**
 *
 * @author YNZ
 */
public class WrapperCon {

    Integer i1 = new Integer("1");
    Character c1 = new Character('a');

    public static void main(String[] args) {
        //wrapper class passing value in string.
        Float f1 = Float.valueOf("12.3");
        //return primitive into its instance. 
        Float f2 = Float.valueOf(12.5f);

        System.out.println(f1);
        System.out.println(f2);

        //return double
        Double.parseDouble("12.3");
        
        //return Double 
        Double.valueOf("12.3");

        //
        Boolean.parseBoolean("true");
        // -1 <
        System.out.println(Double.compare(1, 2));
        //  1 >
        System.out.println(Double.compare(3, 2));
        //  1 =
        System.out.println(Double.compare(3, 3));

        //convert String <-String.valueOf(object)
        System.out.println(String.valueOf("12.3"));

    }
}
