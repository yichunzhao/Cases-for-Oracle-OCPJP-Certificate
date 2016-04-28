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

//overriding if return types are primitives, then they must exactly match each other
// if return types are object types, then the super-class return type is tyep boundary.     
    @Override
    public short getValue() {
        return 2;
    } //2

}
