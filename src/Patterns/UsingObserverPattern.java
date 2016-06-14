/*
 * Loose coupling
 */
package Patterns;

import java.util.Observable;
import java.util.Observer;

/**
 * @author YNZ
 */
class Subject extends Observable {

    private String state;

    public Subject() {
        super();
        state = "inital";
    }

    public void setNewState(String state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public String getNewState() {
        return state;
    }

    public String toString() {
        return state;
    }
}

class Reader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("update to " + ((Subject) o).getNewState());
        }
    }
}

public class UsingObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Reader reader = new Reader();
        Reader reader1 = new Reader();
        subject.addObserver(reader);
        subject.addObserver(reader1);

        subject.setNewState("new state");

    }

}
