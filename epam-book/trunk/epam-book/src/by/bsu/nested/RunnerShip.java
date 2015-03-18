package by.bsu.nested;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class RunnerShip {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        lifeBoat.swim();
    }
}
