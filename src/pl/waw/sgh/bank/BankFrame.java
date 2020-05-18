package pl.waw.sgh.bank;

import javax.swing.*;

public class BankFrame {

    public static void main(String[] args) {
        JFrame customerDataFrame = new JFrame("Bank - Customer form");
        CustomerDataLogic customerDataLogic = new CustomerDataLogic(customerDataFrame);

        customerDataFrame.add(customerDataLogic.getMainCustomerPanel());
        customerDataFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        customerDataFrame.pack();
        customerDataFrame.setVisible(true);
    }
}
