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
interface Graphic {

    void draw();
}

class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

abstract class GraphicObject implements Graphic {

    //initial point.
    protected int x;
    protected int y;

    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Point getInitialPoint() {
        return new Point(x, y);
    }

}

class Circle extends GraphicObject {

    public static int NumOfInstance;
    private float r;

    public Circle(int x, int y, float r) {
        super(x, y);
        this.r = r;

        NumOfInstance++;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     */
    @Override
    public void draw() {

        System.out.println("draw a circle at " + "(" + x + ", " + y + ")" + "rad = " + r);
    }
}
