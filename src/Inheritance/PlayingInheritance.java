/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author YNZ
 */
abstract class BaseUser {

    public BaseUser() {
        System.out.println("base user");
    }
    
    public void doSth(){
        System.out.println("base user do");
    }
    
}

class Lister extends BaseUser{

    public Lister() {
        System.out.println("lister user");
    }
    
    @Override
    public void doSth(){
        System.out.println("lister do");
    }
    
}

class Searcher extends BaseUser{

    public Searcher() {
        System.out.println("searcher user");
    }
    
    @Override
    public void doSth(){
        System.out.println("searcher do");
    }
   
}

public class PlayingInheritance{
    public static void main(String[] args) {
        
        BaseUser b1 = new Lister();
        BaseUser b2 = new Searcher();
        b1.doSth();
        b2.doSth();
        
        if(b1 instanceof Lister) System.out.println("b1 is a lister");
        if(b2 instanceof Searcher) System.out.println("b2 is a searcher");
        
        //widdening principle 
        //narrowing principle
                
    }
} 
