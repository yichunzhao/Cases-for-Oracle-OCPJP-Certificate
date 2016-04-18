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
public class LoopingInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 10;
        int end = Integer.MAX_VALUE;
        int count = 0;
        
        //2,147,483,647
        
        System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
        System.out.println("start= " + start);
        System.out.println("end= " + end);
        

        for (int i = start; i <= end; i++) {
            System.out.println("i= "+i);//overflow
            count++;
        }

    }

}
