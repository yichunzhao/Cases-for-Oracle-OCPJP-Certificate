/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import java.util.Date;

/**
 *
 * @author YNZ
 */

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

class AfricanBat extends Bat implements Flyer{

}

public class TestFlyer {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        AfricanBat a = new AfricanBat();
        
        if (f instanceof Bird) {
            System.out.println("f is a Bird");
        }
        if (e instanceof Flyer) {
            System.out.println("e is a Flyer");
        }
        if (b instanceof Flyer) {
            System.out.println("f is a Bird");
        }
        if(a instanceof Flyer){
            System.out.println("f is a Flyer");
        }
    }
}

