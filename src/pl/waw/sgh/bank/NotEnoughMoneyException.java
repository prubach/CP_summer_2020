package pl.waw.sgh.bank;

public class NotEnoughMoneyException extends BankException {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
