package by.bsu.test5;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class Quest1 {
    public static void main(String[] args) {
        for (Numbers num : Numbers.values()) {
            System.out.print(num.getNumber());
        }
    }
}
enum Numbers {
    ONE(1), TWO(2) {
        public int getNumber() {
            return x + x;
        }
    }, THREE(3) {
        public int getNumber() {
            return x + x + x;
        }
    }, FOUR(4), FIVE(5);
    int x;
    Numbers (int x) {
        this.x = x;
    }
    public int getNumber(){
        return x;
    }
}
