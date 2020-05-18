package pl.waw.sgh.bank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDataLogic extends CustomerData {

    private JFrame mainWindow;

    private Bank bank;

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
                bank.newCustomer(firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText());

                JOptionPane.showMessageDialog(null, "Saving the customer: "
                        + firstNameTextField.getText() + " bank: " + bank.toString());

            }
        });

    }

    public JPanel getMainCustomerPanel() {
        return mainCustomerPanel;
    }
}
