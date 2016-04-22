/*
 * Is this cage only for animals? or for a human? or for all Objects?
 * Using wildcard in the Generic experession. 
 * For a cage, we may specify it holds only certain animals, rather than other things.
 */
package Generic;

import Inheritance.Animal;
import java.util.List;

/**
 *
 * @author YNZ
 * @param <T>
 */
public class Cage<T extends Animal> { //here is non-static declaring of type var.

    private T t;
    //Generic constructor? 
    public Cage(T t) {
        this.t = t;
    }

    public Cage() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    

    /**
     * Adding cage into cages, a list of cages.
     * @param <T>
     * @param t
     * @param cages
     */
    
    public static<T extends Animal> void addCages(T t, List<Cage> cages ){
        for (Cage cage : cages) {
            cages.add(cage);
        }
    }
    
    public void fillCages(T t, List<Cage> cages){
        for (Cage cage : cages) {
            cages.add(cage);
        }
        
    }

}
