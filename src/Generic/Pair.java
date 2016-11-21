/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author YNZ
 * @param <T1>
 * @param <T2>
 */
public class Pair<T1, T2> {

    private T1 t1;
    private T2 t2;

    public Pair() {
    }

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public static void main(String[] args) {
        Pair<Double, Float> p = new Pair<>(new Double(2.3d), new Float(4.5f));
        System.out.println("first " + p.getT1());
        System.out.println("secound " + p.getT2());
    }
}
