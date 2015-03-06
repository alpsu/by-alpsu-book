package by.bsu.enums;

/**
 * Created by A.Aplevich on 06.03.2015.
 */
public class TaxiRunner {
    public static void main(String[] args) {
        TaxiStation ts = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase());
        System.out.println(ts + " : ordinal -> " + ts.ordinal());
        ts.setFreeCabs(3);
        TaxiStation[] station = TaxiStation.values();
        for (TaxiStation elem : station) {
            System.out.println(elem);
        }
    }
}
