/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 * Abstract class cannot be instantiated, used for modeling the common features
 * among a group of similar matters. mainly reusing the common code.
 *
 * @author YNZ
 */
public abstract class Television implements Controllable {
    protected Integer channel;
    protected Float screenSize;
    protected Float voltage;

    public Television() {
    }

    public Television(Integer channel, Float screenSize) {
        this.channel = channel;
        this.screenSize = screenSize;
    }

    public Television(Integer ch) {
        this.channel = ch;
    }
}
