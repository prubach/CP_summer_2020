package pl.waw.sgh.bank;

import javax.swing.*;

public class CustomerDataLogic extends CustomerData {

    private JFrame mainWindow;

    public CustomerDataLogic(JFrame mainWindow) {
        super();
        this.mainWindow = mainWindow;
        // Adding main Panel to Main Frame
        //this.mainWindow.add(mainCustomerPanel);

    }

    public JPanel getMainCustomerPanel() {
        return mainCustomerPanel;
    }
}
