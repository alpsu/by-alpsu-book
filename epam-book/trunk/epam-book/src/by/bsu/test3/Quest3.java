package by.bsu.test3;

/**
 * Created by A.Aplevich on 07.03.2015.
 */
public class Quest3 {
    public static int method() {
        final int loc;
        //System.out.println(loc);
        loc = 4;
        return loc + 1;
    }

    public static void main(String[] args) {
        method();method();method();
        System.out.println(method());
    }
}
