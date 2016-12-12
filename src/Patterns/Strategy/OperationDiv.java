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
public class OperationDiv implements Strategy{

    @Override
    public double doOperation(double a, double b) {
        return a/b;
    }
    
}
