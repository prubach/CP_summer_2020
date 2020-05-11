package pl.waw.sgh.bank;

public class AccountNotFoundException extends BankException {
    private Integer accId;

    public AccountNotFoundException(String message, Integer accid) {
        super(message);
        this.accId = accid;
    }

    public Integer getAccId() {
        return accId;
    }
}
