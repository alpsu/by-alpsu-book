package by.bsu.fund.bean;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class Coin {
    public double diameter;
    private double weight;

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
    }

    public double takeWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
