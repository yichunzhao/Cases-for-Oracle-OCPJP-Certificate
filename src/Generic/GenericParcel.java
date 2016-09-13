/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author YNZ
 */

class Book{
    
}

class Phone{
    
}

//parcel of T
class Parcel<T>{
    private T t;

    public Parcel() {
    }

    public Parcel(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}

public class GenericParcel {
    public static void main(String[] args) {
        Parcel<Book> parcel = new Parcel<>();
        parcel.setT(new Book());
        
        System.out.println(parcel.getT().getClass().getName());
        System.out.println(parcel.getT() instanceof Book);
        
        
    }
    
}
