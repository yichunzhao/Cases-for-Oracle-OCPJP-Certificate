/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author YNZ
 */
public class Base2 extends Base {
    protected static int ROOT = 20;
    
    final float height = 1.00f; 
    

//overriding if return types are primitives, then they must exactly match each other
// if return types are object types, then the super-class return type is tyep boundary.     
    @Override
    public short getValue() {
        return 2;
    } //2
    
    @Override
    public int getValue(int i){
        return i;
    }
    
    //access modifier is a fator to decern an overriding?
    //Yes; it must be the same access modifier as the super class instance method.
    @Override
    public short getAge(){
        return 40;
    }
    
    //super class static could be hidden, but not overridden. 
    public static int getId() {
        return 3;
    }
    
    /* class method cannot be overridden by an instance method in the sub-class. 
       this will cause a compiling error.
    @Override
    public float getSize(){
       return 1.9f; 
    } */

    
    
}
