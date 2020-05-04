package pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer c1 = myBank.newCustomer("Pawel", "Rubach", "pawel.rubach@sgh.waw.pl");
        Customer c2 = myBank.newCustomer("Anna", "Smith", "anna.smith@sgh.waw.pl");

        Account a1 = myBank.newDebitAccount("EUR", c1);
        a1.deposit(150d);

        a1.charge(40d);
        Account a2 = myBank.newSavingsAccount("PLN", c2);

        System.out.println(myBank);
    }
}
