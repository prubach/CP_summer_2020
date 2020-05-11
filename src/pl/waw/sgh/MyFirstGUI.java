package pl.waw.sgh;

import javax.swing.*;
import java.awt.*;

public class MyFirstGUI {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My first GUI app");
        myFrame.setSize(600, 400);

        LayoutManager layoutManager = new FlowLayout();
        myFrame.setLayout(layoutManager);
        JPanel namePanel = new JPanel();
        JLabel myLabel1 = new JLabel("What is your name?");
        JTextField nameField = new JTextField(10);
        namePanel.add(myLabel1);
        namePanel.add(nameField);
        myFrame.add(namePanel);
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //myFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        myFrame.setVisible(true);
    }

}
