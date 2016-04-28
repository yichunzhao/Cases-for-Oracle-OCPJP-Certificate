/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

/**
 *
 * @author YNZ
 */
public class Apple {

    private float size;

    public Apple(float size) {
        this.size = size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }
    
    @Override
    public String toString(){
        return Float.toString(this.size);
    }


}
