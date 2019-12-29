package com.bot.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI {
    /**
     * @wbp.parser.entryPoint
     */
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Twitch Bot!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Many important features.");
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
