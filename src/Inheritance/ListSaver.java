/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.List;

/**
 *
 * @author YNZ
 */
class ListSaver {

    int i = 0;
    Object prevObject;

    public void saveObject(List e) {
        prevObject = e;
        i++;
    }

}
