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

class BookParcel<T,K> extends Parcel<T> {
}

class PoneParcel<T> extends Parcel<T>{
}

class Cell extends Parcel<Long>{
    
}

public class GnericClassExtendAnotherGeneric {
    Parcel<Integer> bookParcel = new BookParcel<>();
    PoneParcel<Long> parcel = new PoneParcel<>();
    Cell cell = new Cell();
}
