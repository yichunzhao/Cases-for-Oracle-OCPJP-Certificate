/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author YNZ
 */
public class Circle extends GraphicObject {
    public static int numberofInstance;
    private static int numberofcreated;
    private float r;

    public Circle(int x, int y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
        numberofInstance++;
        numberofcreated=numberofInstance;
    }

    /**
     *
     */
    @Override
    public void draw() {

        System.out.println("draw a circle at " + "("+ x + ", " + y+")" + "rad = " +r);
    }

}
