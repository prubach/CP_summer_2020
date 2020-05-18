package pl.waw.sgh.bank;

import com.github.cliftonlabs.json_simple.JsonObject;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class BankFrame {

    static final String DAT_FILE = "bank.dat";
    static final String JSON_DAT_FILE = "bank.json";

    public static void main(String[] args) {

        Bank bank = readBank(DAT_FILE);

        JFrame customerDataFrame = new JFrame("Bank - Customer form");
        CustomerDataLogic customerDataLogic = new CustomerDataLogic(customerDataFrame, bank);

        customerDataFrame.add(customerDataLogic.getMainCustomerPanel());
        customerDataFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        customerDataFrame.pack();
        customerDataFrame.setVisible(true);
        customerDataFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Closing now!!");
                writeBank(bank, DAT_FILE);
                writeBankToJSON(bank, JSON_DAT_FILE);
                super.windowClosing(e);
            }
        });
    }

    private static Bank readBankFromJSON(String dataFile) {
        try {

            FileInputStream fis = new FileInputStream(dataFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Bank)ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, "No bank data file found, creating a new bank");
            return new Bank();
        }
    }

    private static void writeBankToJSON(Bank bank, String dataFile) {
        try {
            final JsonObject json = new JsonObject();
            File myFile = new File(dataFile);
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(fw);
            json.put("Bank", bank);
            json.toJson(bw);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Bank readBank(String dataFile) {
        try {
            FileInputStream fis = new FileInputStream(dataFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Bank)ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, "No bank data file found, creating a new bank");
            return new Bank();
        }
    }

    private static void writeBank(Bank bank, String dataFile) {
        try {
            FileOutputStream fos = new FileOutputStream(dataFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bank);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
