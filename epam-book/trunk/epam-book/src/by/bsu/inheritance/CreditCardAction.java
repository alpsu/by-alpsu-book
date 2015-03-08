package by.bsu.inheritance;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class CreditCardAction extends CardAction {
    public boolean checkCreditLimit() {
        return true;
    }

    @Override
    public void doPayment(double amountPayment) {
        System.out.println("complete from credit card");
    }
}
