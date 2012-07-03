package jp.itacademy.samples.exception;

public class BalanceNotEnoughException extends Exception {
    public BalanceNotEnoughException(Account acc) {
        super("お金が足りません。残高: " + acc.getBalance());
    }
}
