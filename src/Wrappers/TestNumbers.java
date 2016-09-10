/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author YNZ
 */
public class TestNumbers {

    public static void main(String[] args) {
        Number[] numbers = new Number[4];
        numbers[0] = 1.0f;
        numbers[1] = new Integer("20");
        numbers[2] = 400.0d;
        numbers[3] = new Byte("12");

        Double sum = sum(numbers);
        System.out.println("sum = " + sum);
    }

    public static double sum(Number[] numbers) {
        double sum = 0.0;
        for (Number d : numbers) {
            sum += d.doubleValue();
        }

        return sum;
    }

}
