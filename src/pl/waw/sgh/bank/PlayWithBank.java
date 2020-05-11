package pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer c1 = myBank.newCustomer("Pawel", "Rubach", "pawel.rubach@sgh.waw.pl");
        Customer c2 = myBank.newCustomer("Anna", "Smith", "anna.smith@sgh.waw.pl");

        try {
            Account a1 = myBank.newDebitAccount("EUR", c1);
            a1.deposit(150d);

            Account a2 = myBank.newSavingsAccount("EUR", c2);
            a1.charge(40d);
            myBank.transfer(0, 1, 160d);
        } catch (AccountNotFoundException ae) {
            System.out.println(ae.getMessage());
            System.out.println(ae.getAccId());
        } catch (NotEnoughMoneyException ne) {
            System.out.println(ne.getMessage());
        }

        //myBank.transfer(a1.getId(), a2.getId(), 60d);
        System.out.println(myBank);
        //System.exit(100);
    }
}
