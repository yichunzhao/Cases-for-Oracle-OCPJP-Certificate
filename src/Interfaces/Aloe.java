/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author YNZ
 */
public class Aloe implements CharSequence {

    String str;
    
    public Aloe(){
        this.str = "this is a test string!";
    }

    public Aloe(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return this.str.length();
    }

    @Override
    public char charAt(int index) {
        return this.str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.str.substring(start, end);
    }

}
