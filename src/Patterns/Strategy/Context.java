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
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public double excuteOperation(double a, double b){
        return strategy.doOperation(a, b);
    }
    
}
