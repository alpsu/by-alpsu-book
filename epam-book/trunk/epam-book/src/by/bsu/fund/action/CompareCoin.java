package by.bsu.fund.action;

import by.bsu.fund.bean.CoinOne;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class CompareCoin {
    public void CompareDiameter(CoinOne first, CoinOne second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("Первая монета больше второй на " + delta);
        } else if (delta == 0) {
            System.out.println("Монеты имеют одинаковый диаметр");
        } else {
            System.out.println("Вторая монета больше первой на " + -delta);
        }
    }
}
