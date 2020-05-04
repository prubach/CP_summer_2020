package pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) {
        Customer c1 = new Customer("Pawel", "Rubach", "pawel.rubach@sgh.waw.pl");
        System.out.println(c1);
        Customer c2 = new Customer("Anna", "Smith", "anna.smith@sgh.waw.pl");
        System.out.println(c2);

        Account a1 = new DebitAccount("EUR", c1);
        a1.deposit(150d);

        a1.charge(40d);
        System.out.println(a1);
        Account a2 = new SavingsAccount("PLN", c2);
        System.out.println(a2);

//        c1.setEmail("pawel.rubach@sgh.waw.pl");
//        c1.setFirstName("Pawel");
//        c1.setastName = "Rubach";

    }
}
