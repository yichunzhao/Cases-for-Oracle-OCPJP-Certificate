/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author YNZ
 */
public class Bike implements Ridable {

    public short gear = 1;
    public short degree = 0; 

    public Bike() {

        System.out.println("geat=" + gear);
    }

    public Bike(short gear) {
        this.gear = gear;
        //this.setGear(gear);
    }

    @Override
    public void setGear(short gear) {
        this.gear = gear;
    }

    @Override
    public short getGear() {
        return this.gear;
    }

    @Override
    public void turnLeft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void turnLeft(float degree){
        this.degree-=degree;
    }

    @Override
    public void turnRight(float degree) {
        this.degree+=degree;
        
    }

    @Override
    public void ride() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void turnRight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
