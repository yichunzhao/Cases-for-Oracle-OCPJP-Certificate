/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Factory;

/**
 *
 * @author YNZ
 */
public class Client {
    
    public static void main(String[] args) {
        App app = AppFactory.getAppInstance("doc");
        app.open("file.doc");
        
    }
    
}
