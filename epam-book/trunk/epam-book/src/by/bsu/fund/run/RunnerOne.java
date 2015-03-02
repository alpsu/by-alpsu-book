package by.bsu.fund.run;

/**
 * Created by A.Aplevich on 02.03.2015.
 */

import by.bsu.fund.action.CompareCoin;
import by.bsu.fund.bean.CoinOne;

public class RunnerOne {
    public static void main(String[] args) {
        CoinOne ob1 = new CoinOne();
        ob1.setDiameter(-0.11);
        ob1.setDiameter(0.12);
        ob1.setWeight(150);

        CoinOne ob2 = new CoinOne();
        ob2.setDiameter(0.21);
        ob2.setWeight(170);
        CompareCoin ca = new CompareCoin();
        ca.CompareDiameter(ob1, ob2);
    }
}
