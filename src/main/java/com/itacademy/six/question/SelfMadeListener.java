package com.itacademy.six.question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelfMadeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I am self made and consume this" + e.getActionCommand());
        JOptionPane.showMessageDialog(null,e.getActionCommand());
    }
}
