/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author YNZ
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        float b = 20;
        double c = 12;
        System.out.println("result = " + (a + b));
        
        Calculator cal = new CalculationImpl();
        cal.calculate(a, a);
        //cal.calculate(a, a,b);
        
        
        

    }
}
