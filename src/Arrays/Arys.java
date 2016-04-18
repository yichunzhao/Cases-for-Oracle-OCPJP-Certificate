/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author YNZ
 */
public class Arys {

    int[] a1 = new int[10];
    int[][] am;
    String[] s1 = new String[3];

    public Arys() {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }
        am = new int[][]{{1, 2}, {3, 4}, {4, 5, 6}};
        s1[1] = "funcking shut up!";
    }

    public void printMatrix(int[][] vs) {
        for (int[] v : vs) {
            printVec(v);
        }
    }

    public void printVec(int[] v) {
        for (int e : v) {
            System.out.print(e);
        }
    }

    public static void main(String[] args) {
        Arys as = new Arys();
        System.out.println("a1 length=" + as.a1.length);
        System.out.println("s1 length=" + as.s1.length + as.s1.toString());
        System.out.println(as.am.length);
        as.printMatrix(as.am);

        for (String s : as.s1) {
            System.out.println(s);
        }
    }

}
