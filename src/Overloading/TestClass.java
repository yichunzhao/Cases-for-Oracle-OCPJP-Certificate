/*
 * JVM finds the closest type? maybe not that simple.
 * one thing could be confirmed; the exaclty matched type will be the first
 * preference. for integers, then long is first preference, even passing a int.
 * If you add a Object type, then int will fall in there. wow, this is too hard. 
 */
package Overloading;

/**
 *
 * @author YNZ
 */
class TestClass {

    void probe(int... x) {
        System.out.println("In ...");
    } //1

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(long x) {
        System.out.println("In long");
    } //3

    void probe(Long x) {
        System.out.println("In LONG");
    } //4
    
    void probe(Object x) {
        System.out.println("In Object");
    } //5
    

    public static void main(String[] args) {
        Integer a = 4;
        new TestClass().probe(a); //5
        Long b = 4L;
        new TestClass().probe(b); //6
    }
}
