/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author YNZ
 */

class M{
    
}

class N {

    private M m = new M();

    public void makeItNull(M pM) {
        pM = null;
    }

    public void makeThisNull() {
        makeItNull(m);
    }

    public static void main(String[] args) {
        N n = new N();
        n.makeThisNull();
        
        System.out.println(n.getClass().getName());
    }
}
