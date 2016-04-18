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
public interface Ridable {
    void turnLeft();
    void turnRight(float degree);
    void turnRight();
    void setGear(short gear);
    short getGear();
    void ride();
}
