/*
 * Class wrappers of primitive types offer static service methods. 
 * converting digit numbers from String to numeric primitive type.
 * String class offers another way around, converting number to string.
 */
package NumberWraper;

/**
 *
 * @author YNZ
 */
public class UserNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d = Double.parseDouble("20.456");
        double a = Double.parseDouble("10.461");

        double sum = a + d;
        System.out.printf("%f + %f = %f \n ", d, a, sum);

        //converting from numeric to string. 
        String aStr = String.valueOf(d);
        String dStr = String.valueOf(a);

        //valueOf returns wrapper type
        Double e = Double.valueOf(dStr);
        System.out.println(e.toString());

    }
}
