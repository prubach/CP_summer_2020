package pl.waw.sgh.bank;

public class DebitAccount extends Account {

    public DebitAccount(String currency, Customer customer, Integer accountId) {
        super(currency, customer, accountId);
    }
}
