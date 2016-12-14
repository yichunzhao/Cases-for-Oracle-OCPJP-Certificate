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
public class WordProcessor implements App{

    @Override
    public void open(String fileName) {
        System.out.println("open the file by word!");
    }
    
}
