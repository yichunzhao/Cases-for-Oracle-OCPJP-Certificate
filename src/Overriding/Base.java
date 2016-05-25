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
public class Base {

    public static int ID = 0;
    protected static int ROOT = 1;
    //public static final defines a constant; you can operate on a constant var. 

    final float height; //constant can be init in the constructor. 
   

    public static int getId() {
        return ID;
        //return this.ID; this is not valid; for this refer to the instance, not the class;
        //so it will cause a compiling error; "a non-static refers to a static context." 
    }

    public static float getSize() {
        return 1.8f;
    }

    public short getAge() {
        return 50;
    }

    public Base() {
        ID += 1;
        height = 1.99f;
        
    }

    public short getValue() throws Exception {
        return 1;
    } //1

    int getValue(int i) {
        return i;
    }
}
