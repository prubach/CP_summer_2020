package pl.waw.sgh.bank.db;

import pl.waw.sgh.bank.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerDao {

    public final static String DB_DRIVER = "org.h2.Driver";
    public final static String DB_URL = "jdbc:h2:~/mydb;create=true;user=sa;password=123";

    private static CustomerDao instance;

    private Connection connection;

    public static CustomerDao getInstance() {
        if (instance == null) {
            CustomerDao.initialize(DB_DRIVER, DB_URL);
        }
        return instance;
    }

    private static void initialize(String databaseDriverClassName,
                                   String databaseURL) {
        instance = new CustomerDao(databaseDriverClassName, databaseURL);
    }

    private CustomerDao(String className, String url) {
        try {
            Class.forName(className).newInstance();
            connection = DriverManager.getConnection(url);
            DatabaseMetaData dbm = connection.getMetaData();
            ResultSet rs = dbm.getTables(null, null, "CUSTOMER", null);
            if (!rs.next()) {
                connection.createStatement().execute(
                        "create table CUSTOMER ( "
                                + "CUSTOMER_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT customers_pk PRIMARY KEY, "
                                + "FIRSTNAME VARCHAR(50), "
                                + "LASTNAME VARCHAR(50),"
                                + "EMAIL VARCHAR(80)"
                                + ") ");
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void store(Customer customer) {
        try {
            PreparedStatement pStmt = connection
                    .prepareStatement("insert into " +
                            "CUSTOMER(FIRSTNAME, LASTNAME, EMAIL) " +
                            "values(?, ?, ?)");
            //.prepareStatement("insert into " +
            //		"CUSTOMER(FIRSTNAME, LASTNAME) values(" +
            //		 customer.getFirstName() + ", " +
            //		 customer.getLastName() + ")");
            //pStmt.setLon
            pStmt.setString(1, customer.getFirstName());
            pStmt.setString(2, customer.getLastName());
            pStmt.setString(3, customer.getEmail());
            pStmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            PreparedStatement pStmt = connection
                    .prepareStatement("delete from CUSTOMER where CUSTOMER_ID = ?");
            pStmt.setInt(1, id);
            pStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Integer id, String firstName, String lastName, String email) {
        try {
            PreparedStatement pStmt = connection
                    .prepareStatement(
                            "UPDATE CUSTOMER SET FIRSTNAME=?, LASTNAME=?, EMAIL=? WHERE CUSTOMER_ID =?");
            pStmt.setString(1, firstName);
            pStmt.setString(2, lastName);
            pStmt.setString(3, email);
            pStmt.setInt(4, id);
            pStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // UPDATE
    // UPDATE CUSTOMER SET FIRSTNAME=?, LASTNAME=? WHERE CUSTOMER_ID =?

    public List<Customer> retrieveCustomers() {
        try {
            List<Customer> customers = new ArrayList<Customer>();
            ResultSet rs = connection.createStatement().executeQuery(
                    "select CUSTOMER_ID, FIRSTNAME, LASTNAME, EMAIL from CUSTOMER");
            //"select * from CUSTOMER");
            while (rs.next()) {
                Customer customer = new Customer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(1));
                customers.add(customer);
            }
            rs.close();
            return customers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        //Customer kl1 = new Customer("John", "Brown", "john@brown.com", 0);
        //Customer kl2 = new Customer("Anne", "Smith", "anne@smith.com",0);

//        System.out.println("Storing customers");
//        CustomerDao.getInstance().store(kl1);
//        CustomerDao.getInstance().store(kl2);

        //        //CustomerDao.getInstance().delete(3);
//
//        CustomerDao.getInstance().update(4, "Joanne", "D'Arc", "email");
//
        System.out.println("Retrieving customers");
        List<Customer> customers = CustomerDao.getInstance().retrieveCustomers();
        for (Customer customer : customers) {
            System.out.println("-----------------------------");
            System.out.println("ID: " + customer.getId());
            System.out.println("FirstName: " + customer.getFirstName());
            System.out.println("LastName: " + customer.getLastName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("-----------------------------");
        }

    }
}
