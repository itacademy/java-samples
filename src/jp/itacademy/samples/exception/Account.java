package jp.itacademy.samples.exception;

public class Account {

    private String name;
    private int balance;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int val) {
        if (val <= 0)
            throw new IllegalArgumentException();
        balance += val;
    }

    public void withdraw(int val) throws BalanceNotEnoughException {
        if (val <= 0)
            throw new IllegalArgumentException();
        if (balance < val)
            throw new BalanceNotEnoughException(this);
        balance -= val;
    }

    public String toString() {
        return "口座[" + name + "] ... 残高: " + balance;
    }
}
