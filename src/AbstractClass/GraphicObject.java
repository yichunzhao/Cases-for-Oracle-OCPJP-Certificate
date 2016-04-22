/*
 * Abstract class may implement interfaces; but there is no need to implment
 * all of his abstracted methods. 
 */
package AbstractClass;

/**
 *
 * @author YNZ
 */
public abstract class GraphicObject implements Graphic {
    //declare constant
    
    //declare shared variables and implemented method
    //private can be accessed within only this class. 
    //protected then can be accessed within this class, and its subclasses. 
    //for a abstract class, it should be meaningful to declare common attributes 
    //as protected type. 
    protected int x;
    protected int y; 
}
