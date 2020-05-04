package pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Account {

    private static Integer lastAccountId = 0;

    private Integer id;

    private BigDecimal balance;

    private String currency = "EUR";

    private Customer customer;

    public Account(String currency, Customer customer) {
        this.balance = new BigDecimal(0);
        this.currency = currency;
        this.customer = customer;
        this.id = lastAccountId++;
    }

    public static Integer getLastAccountId() {
        return lastAccountId;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getBalance() {
        //BigDecimal b = balance.add(new BigDecimal(35));
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", customer=" + customer +
                '}';
    }
}
