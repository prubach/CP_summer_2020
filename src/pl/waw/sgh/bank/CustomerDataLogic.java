package pl.waw.sgh.bank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomerDataLogic extends CustomerData {

    private JFrame mainWindow;

    private Bank bank;

    private Customer currentCust;

    private JPopupMenu ctxMenu;

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
        // Context Menu
        ctxMenu = new JPopupMenu("Operations on accounts");
        JMenuItem newSavingsAcc = new JMenuItem("New Savings Account");
        newSavingsAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account newAcc = bank.newAccount(false, "EUR", currentCust);
                accountsTableModel.addRow(newAcc);
            }});

        JMenuItem newDabitAcc = new JMenuItem("New Debit Account");
        newDabitAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account newAcc = bank.newAccount(true, "EUR", currentCust);
                accountsTableModel.addRow(newAcc);
            }});

        ctxMenu.add(newSavingsAcc);
        ctxMenu.add(newDabitAcc);

        JMenuItem delAcc = new JMenuItem("Delete Account");
        delAcc.addActionListener(e -> {
            int[] selectedRows = accountsTable.getSelectedRows();
            for (int rowId : selectedRows) {
                Account accToDel = accountsTableModel.getAccountByRow(rowId);
                bank.deleteAccount(accToDel);
            }
            showCustomer(currentCust);
        });
        ctxMenu.add(delAcc);

        accountsTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    ctxMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void showCustomer(Customer customer) {
        currentCust = customer;
        firstNameTextField.setText(customer.getFirstName());
        lastNameTextField.setText(customer.getLastName());
        emailTextField.setText(customer.getEmail());
        customerIDtextField.setText(customer.getId().toString());

        accountsTableModel.clearTable();
        accountsTableModel.addRows(bank.findAccountsByCustomer(currentCust));
    }


    public JPanel getMainCustomerPanel() {
        return mainCustomerPanel;
    }
}
