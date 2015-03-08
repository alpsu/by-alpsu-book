package by.bsu.test3;

import java.util.Date;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class Quest7<T> {
    private T pole;
    public Quest7(T pole) {
        this.pole = pole;
    }
    public void setPoleDefault() {
        //pole.setTime(1000);
    }

    public static void main(String[] args) {
        Quest7<Date> obj = new Quest7<>(new Date());
        obj.setPoleDefault();
    }
}
