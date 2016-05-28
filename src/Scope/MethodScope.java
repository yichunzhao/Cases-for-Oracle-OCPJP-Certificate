/*
 * Class method(static method); accessible outside instances 
 * Instance method(non static method)
 * 
 */
package Scope;

/**
 *
 * @author YNZ
 */
interface Drivable {

    public void drive();
}

abstract class Viecle implements Drivable {

    protected String direction;
    protected boolean brake;

    public void setBrake(boolean on) {
        this.brake = on;
    }
}

class Car extends Viecle {

    @Override
    public void drive() {
        if (!brake) {
            System.out.println("drive");
        }
    }
}

public class MethodScope {

}
