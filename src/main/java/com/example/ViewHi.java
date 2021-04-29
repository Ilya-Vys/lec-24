package com.example;

import javax.swing.*;
import java.awt.*;

public class ViewHi {

    private final JLabel helloNameLabel;
    private final JTextField userInputTextField;
    private final JButton sayHiBtn;

    public ViewHi() {
        JFrame frame = new JFrame("Simple App - MVC");
        helloNameLabel = new JLabel("Hello", JLabel.RIGHT);
        helloNameLabel.setPreferredSize(new Dimension(100, 20));
        userInputTextField = new JTextField(20);
        sayHiBtn = new JButton("Say Hi");
        JLabel nameEnterLabel = new JLabel("Enter your name");
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(nameEnterLabel);
        content.add(userInputTextField);
        content.add(sayHiBtn);
        content.add(helloNameLabel);
        frame.setContentPane(content);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JButton getSayHiBtn() {
        return sayHiBtn;
    }

    public JLabel getHelloNameLabel() {
        return helloNameLabel;
    }

    public JTextField getUserInputTextField() {
        return userInputTextField;
    }
}
