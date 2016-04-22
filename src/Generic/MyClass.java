/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import Collec.Apple;

/**
 *
 * @author YNZ
 * @param <T>
 * @param <X>
 */
public class MyClass<T extends Comparable,X> {

    private X obj;
    private T t; 

    //declare formal type variable X
    public MyClass(X x) {
        this.obj = x;
    }
    
    public  X getObj(){
        return obj;
    }
    
    public static void main(String[] args){
        MyClass<String,Apple> myClass= new MyClass(new Apple(1.2f));//formal type variables will be inferred.  both T and X
        System.out.println(myClass.getObj().getClass());
    }

}
