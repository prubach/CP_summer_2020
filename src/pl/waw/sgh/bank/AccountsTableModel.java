package pl.waw.sgh.bank;

import javax.swing.table.DefaultTableModel;

public class AccountsTableModel extends DefaultTableModel {

    public static String[] cols = { "ID", "Type", "Currency", "Balance"};

    public AccountsTableModel() {
        super(cols, 3);
    }
}
