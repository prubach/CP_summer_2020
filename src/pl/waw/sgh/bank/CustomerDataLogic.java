package pl.waw.sgh.bank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDataLogic extends CustomerData {

    private JFrame mainWindow;

    private Bank bank;

    private Customer currentCust;

    public CustomerDataLogic(JFrame mainWindow, Bank bank) {
        super();
        this.mainWindow = mainWindow;
        this.bank = bank;
        // Adding main Panel to Main Frame
        //this.mainWindow.add(mainCustomerPanel);
        //sendButton.addActionListener(new SendButtonActionListener());
        sendButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Customer newCust = bank.newCustomer(firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText());
                currentCust = newCust;
                JOptionPane.showMessageDialog(null, "Saving the customer: "
                        + firstNameTextField.getText() + " bank: " + bank.toString());
                Account newAcc = bank.newAccount(true, "EUR", newCust);
                accountsTableModel.addRow(newAcc);
                newAcc = bank.newAccount(false, "EUR", newCust);
                accountsTableModel.addRow(newAcc);
            }
        });
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Customer nextCust = bank.nextCustomer(currentCust);
                if (nextCust!=null)
                    showCustomer(nextCust);
            }
        });
        previousButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Customer prevCust = bank.previousCustomer(currentCust);
                if (prevCust!=null)
                    showCustomer(prevCust);
            }
        });
    }

    private void showCustomer(Customer customer) {
        currentCust = customer;
        firstNameTextField.setText(customer.getFirstName());
        lastNameTextField.setText(customer.getLastName());
        emailTextField.setText(customer.getEmail());
        customerIDtextField.setText(customer.getId().toString());
    }


    public JPanel getMainCustomerPanel() {
        return mainCustomerPanel;
    }
}
