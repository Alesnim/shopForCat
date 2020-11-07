package com.javalesson.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("sddasd");
        frame.setSize(200, 300);


        JFrame frame2 = new JFrame();
        frame2.setSize(50, 50);
        frame2.setBackground(Color.BLACK);
        JTextField textField = new JTextField("42");
        textField.setPreferredSize(new Dimension(50, 20));
        JButton button = new JButton("e");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().equals("42")) {
                    frame2.setVisible(true);
                }
            }
        });

        JLabel label = new JLabel("eeee");
        frame2.add(label);

        frame.getContentPane().add(textField, "West");
        frame.getContentPane().add(button);

        frame.setVisible(true);


    }
}
