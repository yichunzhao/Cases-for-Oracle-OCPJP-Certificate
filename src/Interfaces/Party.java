/*
 * It may implement more than one interface;  
 * they may have the same abstracted methods. it won't give problem. 
 * however, it cannot be the same method signatures, but returning different types.
 * this will confuse the sub-classes, when implementing multiple infterfaces.
 */
package Interfaces;

/**
 *
 * @author YNZ
 */
public class Party implements FirstInterface, SecondInterface {

    @Override
    public String who() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String who(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //p(an instance) is a type of class or interface. 
    public static void main(String[] args) {
        Party p = new Party();
        System.out.println("p is instance of FristInterface = "+ (p instanceof FirstInterface));
        System.out.println("p is instance of SecondInterface = "+ (p instanceof SecondInterface));
        
    }

}
