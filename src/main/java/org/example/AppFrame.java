package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame {
    JTextField textField, textField2;
    JButton button, button2;
    JLabel label1;
    AppFrame() {
        JFrame frame = new JFrame("EmployeesManager");

        button = new JButton("Add employee");
        button.setBounds(325,215,120, 40);

        label1 = new JLabel("Add employee");
        label1.setBounds(340,100,120,40);

        textField = new JTextField("Enter name");
        textField.setBounds(295, 150, 200, 40);

        textField2 = new JTextField("Search employee");
        textField2.setBounds(295, 400, 200, 40);

        button2 = new JButton("Search");
        button2.setBounds(325,465,120, 40);

        frame.add(label1);
        frame.add(textField);
        frame.add(textField2);
        frame.add(button);//adding button in JFrame
        frame.add(button2);

        frame.setSize(800,800);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }
    public void buttonEvent() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                String string1 = textField.getText();
                System.out.println(string1);
            }
        });
    }
}
