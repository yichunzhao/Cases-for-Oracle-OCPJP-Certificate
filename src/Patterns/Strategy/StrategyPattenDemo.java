/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Strategy;

/**
 *
 * @author YNZ
 */
public class StrategyPattenDemo {
    public static void main(String[] args) {
        Strategy strategy = new OperationAdd();
        Context context = new Context(strategy);
        double result = context.excuteOperation(12, 34);
        System.out.println("result = " + result);
        
    }
}
