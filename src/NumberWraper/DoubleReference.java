/*
 * array is not exaclty immutable. it is allowed to modify on its cell. 
 * However, I guess you cannot change the size of array, it may result in an 
 * array instance.
 */
package NumberWraper;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class DoubleReference {

    public static void changeItsCell(Double[] da) {
        da[da.length - 1] = 1997.98;
    }

    public static void changeItNew(Double[] da) {
        Double[] newDa = new Double[]{2.0, 3.0, 89.0, 847592.98};
        da = newDa;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double[] da = new Double[]{2.0, 3.0, 89.0};
        System.out.println(Arrays.toString(da));

        changeItsCell(da);
        System.out.println("changeIt(da)" + Arrays.toString(da));
        
        Double[] daa = new Double[]{2.0, 3.0, 89.0};
        changeItNew(daa);
        System.out.println("changeIt(da)" + Arrays.toString(daa));
        
    }

}
