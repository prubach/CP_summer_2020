package pl.waw.sgh.bank;

import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AccountsTableModel extends DefaultTableModel {

    public static String[] cols = { "ID", "Type", "Currency", "Balance"};

    private List<Account> accountList = new ArrayList<>();

    public AccountsTableModel() {
        super(cols, 0);
    }

    public Account getAccountByRow(int rowId) {
        return accountList.get(rowId);
    }

    public void clearTable() {
        accountList.clear();
        dataVector.clear();
        fireTableDataChanged();
    }


    public void addRows(List<Account> accounts) {
        for (Account acc : accounts)
            addRow(acc);
    }

    public void addRow(Account acc) {
        accountList.add(acc);
        //super.addRow(getVectorFromAccount(acc));
        addRow(getVectorFromAccount(acc));
        fireTableDataChanged();
    }

    public Vector getVectorFromAccount(Account acc) {
        Vector vc = new Vector();
        vc.add(acc.getId());
        vc.add(acc.getClass().getSimpleName().replace("Account", ""));
        vc.add(acc.getCurrency());
        vc.add(acc.getBalance());
        return vc;
    }

    @Override
    public void setValueAt(Object o, int rowId, int colId) {
        super.setValueAt(o, rowId, colId);
        Account acc = accountList.get(rowId);
        switch (colId) {
            case 2:
                acc.setCurrency((String)o);
                break;
            case 3:
                acc.setBalance((BigDecimal)o);
        }
    }

    @Override
    public boolean isCellEditable(int rowId, int colId) {
        if (colId<2) return false;
        else return true;
    }

    @Override
    public Class<?> getColumnClass(int colId) {
        switch(colId) {
            case 0:
                return Integer.class;
            case 3:
                return BigDecimal.class;
            default:
                return String.class;
        }
    }
}
