package by.bsu.test3;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class Quest6 {
    public void meth (Number obj) {
        System.out.println("1");
    }
    public void meth (Character obj) {
        System.out.println("2");
    }

    private static void meth (Integer obj) {
        System.out.println("3");
    }
    public void meth (int i) {
        System.out.println("4");
    }

    public void meth(double d) {
        System.out.println("5");
    }

    public static void main(String[] args) {
        Quest6 q = new Quest6();
        Number n  = 67;
        Integer i = 78;
        q.meth(n);
        q.meth(i);
    }
}
