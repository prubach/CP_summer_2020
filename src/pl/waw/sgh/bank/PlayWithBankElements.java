package pl.waw.sgh.bank;

public class PlayWithBankElements {

    public static void main(String[] args) {
        Customer c1 = new Customer("Pawel", "Rubach", "pawel.rubach@sgh.waw.pl", 0);
        System.out.println(c1);
        Customer c2 = new Customer("Anna", "Smith", "anna.smith@sgh.waw.pl", 1);
        System.out.println(c2);



        Account a1 = new DebitAccount("EUR", c1, 10);
        a1.deposit(150d);

        try {
            a1.charge(40d);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a1);
        Account a2 = new SavingsAccount("PLN", c2, 11);
        System.out.println(a2);

//        c1.setEmail("pawel.rubach@sgh.waw.pl");
//        c1.setFirstName("Pawel");
//        c1.setastName = "Rubach";

    }
}
