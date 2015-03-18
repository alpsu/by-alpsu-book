package by.bsu.nested;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class Ship {
    private int id;
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("Шлюпки на воду!");
        }

        public void swim() {
            System.out.println("Отплытие шлюпки");
        }
    }
}
