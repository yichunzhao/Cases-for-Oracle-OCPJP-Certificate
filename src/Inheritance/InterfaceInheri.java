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
interface Flyer {

    String getName();
}

abstract class Bird implements Flyer {

    public String name;

    public Bird(String name) {
        this.name = name;
        
    }


}

class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println(this.getClass().getName());
        return this.name;
    }
}

class TestClass {

    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");
        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).name);
        System.out.println(((Bird)f).getName());

        System.out.println(f instanceof Eagle);
    }
}

