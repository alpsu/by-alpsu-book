package by.bsu.transfer.bean;

/**
 * Created by A.Aplevich on 05.03.2015.
 */
public class Account {
    private long id;
    private double amount;

    public Account() {
        super();
    }

    public Account(long id) {
        super();
        this.id = id;
    }

    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }
}
