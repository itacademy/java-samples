package jp.itacademy.samples.exception;

public class Transaction {
    
    public static void main(String[] args) {
        Account a = new Account("Aさん");
        a.deposit(200000);
        System.out.println(a);
        try {
            a.withdraw(120000);
            System.out.println(a);
            a.withdraw(120000);
            System.out.println(a);
        } catch (BalanceNotEnoughException e) {
            System.err.println(e.getMessage());
        }
    }
}
