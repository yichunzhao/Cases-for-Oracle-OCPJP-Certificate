/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author YNZ
 */
public enum Accessibility {
    ONCE_WEEK("once per week"), TWICE_WEEK("twice per week"), FEW_TIME_WEEK("few time per week");
    private String descrip;
    
    private Accessibility(String descrip){
        this.descrip = descrip;
    }
    
    public String getDescrip(){
        return this.descrip;
    }
}

class UsingAccessiblity{
    public static void main(String[] args) {
        
        System.out.println(Accessibility.FEW_TIME_WEEK.getDescrip());
    }
}