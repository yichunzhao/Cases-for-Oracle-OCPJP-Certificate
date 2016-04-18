/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
public class AskNoModifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for the field without modifier, it can be accessed from the package class
        Ask ask = new Ask();
        System.out.println("no modifier="+ask.b);
        
        //protected field, could be accessed from external?
        System.out.println("access protected field externally " + ask.str);//protected is not fully hidden like private. 
        
        //for the field declared as private, then it cannot. 
        System.out.println("private modifer="+ask.getBb());
        
        
    }
    
}
