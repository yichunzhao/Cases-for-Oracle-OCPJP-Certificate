/*
 * Using a wrapper class to parse a String value into a primitive 
 * Using a wrapper class to parse a String value into a primitive
 *  double d = Double.parseDouble("20.32"); 
 *  Double dInstance = Long.valueOf("1234");
 */
package Wrappers;

/**
 *
 * @author YNZ
 */
public class WrapperParser {

    public static void main(String[] args) {

        double d = Double.parseDouble("20.32");
        long l = Long.parseLong("12356");
        
        Long longInstance = Long.valueOf("12356");

    }

}
