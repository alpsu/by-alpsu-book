package by.bsu.transfer;

import by.bsu.transfer.bean.Account;

/**
 * Created by A.Aplevich on 05.03.2015.
 */
public class TransferAction {
    private double transactionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean transferIntoAccount (Account from, Account to) {
        double demand = from.getAmount() - transactionAmount;

        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
