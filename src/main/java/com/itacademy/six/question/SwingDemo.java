package com.itacademy.six.question;

import javax.swing.*;

/**
 * Ideja observer design pattern
 *
 * Subject - objekat koji emitira neki dogadaj - dogadaj kao kanala komunikacije izmedu subjekta i observera
 * Observer - objekat koji slusa i reagira na neki Events/ GUI action listener
 *
 * Poenta : da bi observer kozumirao taj dogadaj on se mora subscribe
 *
 */
public class SwingDemo {
    public static void main(String[] args) {

        //subjekat promatranja i 3 listenera imamo
        JButton actionButton = new JButton("Action Dugme");
        actionButton.setActionCommand("Do something");
        AngelListener angelListener = new AngelListener();
        // jedan observer

        ManListener manListener = new ManListener(); // drugi obsever
        // jedan i drugi konzumiraju event

        //addActionListener je zapravo subscribe na acctionButton
        actionButton.addActionListener(angelListener);
        actionButton.addActionListener(manListener);
        actionButton.addActionListener(new SelfMadeListener());

        JFrame frame = new JFrame("Observer Exsmple");
        frame.add(actionButton);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
