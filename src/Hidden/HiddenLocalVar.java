/*
 * scope of var. 
 * instance var hidden by local var. 
 * class var. should be init. as declaring or in static block. 
 * you may init. them in the constructor, but when it is invoked, they may not
 * init.
 */
package Hidden;

/**
 *
 * @author YNZ
 */
class others {

    double x = HiddenLocalVar.min;
}

public class HiddenLocalVar {

    public static double max;
    public static double min;
    private double avg;

    public HiddenLocalVar() {
        avg = 20;
        max = 30;
        min = 100;
    }

    //instance var. hidden by local var.
    public double getAvg() {
        double avg;
        avg = 10;
        return avg;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("" + new others().x);
        
        HiddenLocalVar hlv = new HiddenLocalVar();
        System.out.println(" get avg = " + hlv.getAvg());
        System.out.println(" get avg = " + hlv.avg);
        System.out.println("static max = " + HiddenLocalVar.max);

        

    }

}
