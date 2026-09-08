package com.itacademy.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        String actionCommand = event.getActionCommand();
        System.out.println("Komanda u Angel Listeneru: " + actionCommand);
        System.out.println("do right thing");
    }
}
