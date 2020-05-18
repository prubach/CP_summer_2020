package pl.waw.sgh.bank;

import com.github.cliftonlabs.json_simple.Jsonable;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

public class Customer implements Serializable, Jsonable {

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

    @Override
    public String toJson() {
        return null;
    }

    @Override
    public void toJson(Writer writer) throws IOException {

    }
}
