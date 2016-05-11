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
class ChainedDeclaring {
    // this looks like c type var. declaring, it is also valid in java.
    int a, b, c;
    // this is also valid.
    int d = 100, e, f;
    //however you can assiged a chanined var. in one kick.
    //int p=q=m=100; chained declaring is not allowed

    public ChainedDeclaring() {
        //chaineed assignment is valid. 
        a = b = c = 400;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
