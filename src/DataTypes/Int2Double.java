/*
 * Can assign int to double? for primitive type, actually you can.
 * for objects then you cannot. 
 *       Integer i = 20;
 *       Double d = i;
 * The above is not valid. type check is wrong. you cannot do casting, for 
 * Integer is not Double. 
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
public class Int2Double {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 10;
        System.out.println("a= " + a); //casting into floating format. 
    }
}
