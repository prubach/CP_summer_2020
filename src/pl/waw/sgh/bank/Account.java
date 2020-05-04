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

    public void deposit(Double amount) {
        deposit(BigDecimal.valueOf(amount));
    }

    public void deposit(BigDecimal amount) {
        //TODO: add checks for different situations when deposit may not be run successfully
        this.balance = balance.add(amount);
    }

    public void charge(Double amount) {
        charge(BigDecimal.valueOf(amount));
    }

    public void charge(BigDecimal amount) {
        //TODO: add checks for different situations when charge may not be run successfully
        this.balance = balance.subtract(amount);
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
        return this.getClass().getSimpleName().replace("Account", "") + "{" +
                "id=" + id +
                ", " + balance + " " + currency + '\'' +
                ", cust=" + customer.getId() + " " + customer.getLastName() +
                "}\n";
    }
}
