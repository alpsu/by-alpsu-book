package by.bsu.fund.bean;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class CoinOne {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
