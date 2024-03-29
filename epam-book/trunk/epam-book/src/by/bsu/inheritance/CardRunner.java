package by.bsu.inheritance;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
        dc1.doPayment(15.5);
        dc2.doPayment(21.2);
        cc.doPayment(7.0);
        cc.checkCreditLimit();
        ((CreditCardAction)dc1).checkCreditLimit();
        ((CreditCardAction)dc2).checkCreditLimit();
    }
}
