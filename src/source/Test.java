/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author YNZ
 */
public class Test {
    private static final int C1=10;
    private static final int C2=40;
    public static final int C3=50;
    private int c1=20;
    
    public int getC_1(){
        return Test.C1;
    }
    
    public static int getC1(){
        //int a =a+c1;  class method cannot access instance var. 
        return Test.C2+Test.C1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        float b = 20;
        double c = 12;
        System.out.println("result = " + (a + b));
        System.out.println("private staic var = " + Test.C1);
        
        Calculator cal = new CalculationImpl();
        cal.calculate(a, a);
        //cal.calculate(a, a,b);
        Test tst = new Test();
        System.out.println("tst c1 " +tst.c1 + Test.C1);
        
        
        
        

    }
}
