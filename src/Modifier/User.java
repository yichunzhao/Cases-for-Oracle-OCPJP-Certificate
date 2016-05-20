/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modifier;

/**
 *
 * @author YNZ
 */
public class User {

    private Controllable tv;

    public User(Controllable tv) {
        this.tv = tv;
    }

    public void ctrlTv() {
        tv.setCh(Short.valueOf("10"));
        
    }
}
