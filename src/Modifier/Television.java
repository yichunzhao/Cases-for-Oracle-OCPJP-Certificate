/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modifier;

/**
 * Abstract class cannot be instantiated, used for modeling the common features
 * among a group of similar matters. mainly reusing the common code.
 *
 * @author YNZ
 */
public abstract class Television implements Controllable {

    protected short channel;
    protected short screenSize;
    protected short voice;
    protected boolean on;
    protected String brand;

    public Television(short screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void setUp(short up) {
        voice += up;
    }

    @Override
    public void setDown(short down) {
        voice -= down;
    }

    @Override
    public void turnOn(boolean on) {
        this.on = on;
    }

    @Override
    public void setCh(short ch) {
        channel = ch;
    }

}
