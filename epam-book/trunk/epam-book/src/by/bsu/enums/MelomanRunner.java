package by.bsu.enums;

/**
 * Created by A.Aplevich on 06.03.2015.
 */
public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC;
        System.out.println(ms);
        switch (ms) {
            case JAZZ:
                System.out.println(" is a JAZZ");
                break;
            case CLASSIC:
                System.out.println(" is a CLASSIC");
                break;
            case ROCK:
                System.out.println(" is a ROCK");
            case BLUES:
                System.out.println(" is a BLUES");
                break;
            default:
                System.out.println(" Unknown music style:" + ms);
        }
    }
}
