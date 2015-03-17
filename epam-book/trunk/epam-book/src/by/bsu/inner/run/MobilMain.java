package by.bsu.inner.run;

import by.bsu.inner.Abonent;

/**
 * Created by A.Aplevich on 17.03.2015.
 */
public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Timofey Balashow");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375, 25);
        System.out.println(abonent);
    }
}
