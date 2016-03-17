/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;


public class CalculationImpl extends Calculator {

    public CalculationImpl() {
    }
    
    @Override
        public void calculate(int a, int b) {
        System.out.println(a+b);
    }

       public void calculate(int a, int b, float c){
         System.out.println(a+b+c);  
       }
        
        
}
