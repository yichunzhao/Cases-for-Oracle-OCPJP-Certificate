/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

/**
 *
 * @author YNZ
 */
public class StairCase {

    public void StairCase(int n) {
        if (n <= 100 && n >= 1) {
            for (int i = 1; i <= n; i++) {
                String str = "";
                for (int j = 1; j <= i; j++) {
                    str += "#";
                }
                System.out.println(str);
            }
        } else {
            System.out.println("n is out of bound!");
        }
    }
    
    public void stairCase1(int n){
        if (n <= 100 && n >= 1) {
            for (int i = n; i >= 1; i--) {
                String str = "";
                for (int j = 1; j <= i; j++) {
                    str += "#";
                }
                System.out.println(str);
                
            }
        } else {
            System.out.println("n is out of bound!");
        }
        
        
    }
}
