package pl.waw.sgh.bank;

public class AccountNotFoundException extends Exception {
    private Integer accId;

    public AccountNotFoundException(String message, Integer accid) {
        super(message);
        this.accId = accid;
    }

    public Integer getAccId() {
        return accId;
    }
}
