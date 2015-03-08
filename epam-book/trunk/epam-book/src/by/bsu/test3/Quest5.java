package by.bsu.test3;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class Quest5 {
    public Quest5() {
        System.out.println("1");
    };
    public Quest5(int i) {
        this(i, i);
        System.out.printf("2");
    }
    public Quest5 (int i, int j) {
        this();
        System.out.println("3");
    }

    public static void main(String[] args) {
        Quest5 q = new Quest5(2, 3);
    }
}
