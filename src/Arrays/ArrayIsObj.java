/*
* array is a reference type 
*/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class ArrayIsObj {

    public static void changeIt(Double[] d, Double n) {
        ArrayList<Double> al = new ArrayList<>();
        al.addAll(Arrays.asList(d));//allAll e1 e2 e3
        al.add(n); //all {e1 e2 e3} 
        System.out.println(al.toArray(d) instanceof Double[]);//cannot casting object into its sub-type. 
        d = al.toArray(d);
        System.out.println("in changeIt: " + Arrays.toString(d));
    }

    public static double[] appendArray(double[] d, double[] n) {
        double[] tmp = new double[d.length + n.length - 1];
        System.arraycopy(d, 0, tmp, 0, d.length);
        System.arraycopy(n, 0, tmp, d.length - 1, n.length);
        return tmp;
    }

    public static void changeReferenceType(List<Double> list) {
        list.add(new Double(5998));
    }

    public static void appendString(String[] str) {
        String[] tmp = new String[str.length + 1];
        tmp[tmp.length - 1] = "or I am here";
        str = tmp;
        System.out.println("within change string[]" + Arrays.toString(str));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //array is considered something like a primitive type.
        //it is passed by a copy; it doesn't change its mirror externally
        Double[] d = new Double[]{12.3, 34.5};
        System.out.println("before changeIt: " + Arrays.toString(d));
        changeIt(d, new Double(456));
        System.out.println("after changeIt: " + Arrays.toString(d));

        double[] s = {12, 454.85, 8475.977};
        double[] n = {123.98, 99.999};
        double[] p = appendArray(s, n);
        System.out.println(Arrays.toString(p));

        List<Double> list = new ArrayList(Arrays.asList(d));
        System.out.println("before changeIt: " + list);
        changeReferenceType(list);
        System.out.println("after changeIt" + list);

        //it seems in java primitive type will be considered pass by copy. 
        //whatever you cannot change Array from a method. then you need to return it. 
        //however, this is not about the ArrayList, called reference type. 
        String[] str = new String[]{"dou dou", "wo wo"};
        System.out.println("before change string[]" + Arrays.toString(str));
        appendString(str);
        System.out.println("after change string[]" + Arrays.toString(str));

        String testStr = "am testing";
        System.out.println("String is Object: " + (testStr instanceof String));


    }

}
