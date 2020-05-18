package pl.waw.sgh.bank;

import java.io.Serializable;

public class Customer implements Serializable {

    private static Integer lastCustomerId = 0;

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = lastCustomerId++;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "id=" + id +
                ", fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                "}\n";
    }
}
