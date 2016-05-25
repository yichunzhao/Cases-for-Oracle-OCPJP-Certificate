/*
 * Can a static method be overridden? No. 
 * Instance methods could be overridden, but not class method.
 * overriding is about runtime, how the methods are dynamically selected. 
 * so which overridden method is selected depends on the acutal instance. 
 * 
 */
package Inheritance;

/**
 *
 * @author YNZ
 */
class BBase {

    public static int id = 1;

    //private static String name = this.toString(); this statment is not valid, for this ref. to an instance. 
    public static void whoAmI() {
        System.out.println("A");
    }

    public static void doIt() {
        System.out.println("do it");
    }

    public void doIt(int a) {

    }

    public float doIt(int a, float b) {
        return a + b;
    }

    public int doIt(int a, int b) {
        return a + b;
    }

    public void getInstance() {
        System.out.println(this.hashCode());
    }
}

class BBBBBbase1 extends BBase {

    public static int id = 2;

    public static void whoAmI() {
        System.out.println("B");
    }

    public static void doIt() {
        System.out.println("do it");
    }

    @Override
    public void getInstance() {
        System.out.println(this.hashCode());
    }
}

class CanStaticOverridden {

    public static void main(String... args) {
        BBase.whoAmI();
        BBBBBbase1.whoAmI();

        BBase.doIt();

        BBase a = new BBase();
        BBBBBbase1 b = new BBBBBbase1();

        System.out.println(BBase.id);
        System.out.println(BBBBBbase1.id);

        System.out.println(a.id);
        System.out.println(((BBase) b).id);

        a.getInstance();
        b.getInstance();
    }

}
