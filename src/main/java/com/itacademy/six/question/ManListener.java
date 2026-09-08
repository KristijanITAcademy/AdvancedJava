package com.itacademy.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println("Komanda u human listeneru :" + actionCommand);
        System.out.println("I am man, and I do also good thing");
    }
}
