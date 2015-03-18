package by.bsu.test5;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class Quest3 {
    public static void main(String[] args) {
        Outer obj = new Outer().new Inner1();
        obj.print();
    }
}
class  Outer {
    public void print() {}
    class Inner1 extends Outer{
        public void print() {
            System.out.println("In Inner");
        }
    }
}
