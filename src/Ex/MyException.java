/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
}

interface PersonAgent {

    void search(Person person) throws Exception;
}

abstract class Station {

    abstract void doSth();
}

class PoliceStation extends Station implements PersonAgent {

    @Override
    public void search(Person person) throws MyException, NullPointerException {


        if (person == null) {
            throw new NullPointerException();

        } else {
            System.out.println("search a person ... ");
            throw new MyException("dd");
        }
    }

    @Override
    protected void doSth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class PersonBooks {

    public static void main(String... var) {

        PoliceStation policeStation = new PoliceStation();
        try {
            policeStation.search(null);
        } catch (MyException ex) {
            Logger.getLogger(PersonBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(PersonBooks.class.getName()).log(Level.SEVERE, null, ex);
        }

        policeStation.doSth();

    }
}
