/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author YNZ
 */
public class CaseSeq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Byte b = -10; //-128 to 127
        switch(b){
            case 'b':
            case 'c':
            default:System.out.println("default");
            case -2:
            case 80:
        }
        
        System.out.println("end");
        
    }
    
}
