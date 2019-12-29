package com.bot.ui;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class UI {
    /**
     * @wbp.parser.entryPoint
     */
	private static JButton[] arrayBtn;
	
    /**
     * @wbp.parser.entryPoint
     */
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Twitch Bot!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        panel.setLocation(500,400); 
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel.setLayout(new GridBagLayout());  
        
        JLabel lblHost = new JLabel("Host Name");
        lblHost.setHorizontalAlignment(SwingConstants.RIGHT);
        lblHost.setText("Host:");  
        GridBagConstraints gbc_lblHost = new GridBagConstraints();
        gbc_lblHost.anchor = GridBagConstraints.EAST;
        gbc_lblHost.insets = new Insets(0, 0, 5, 5);
        gbc_lblHost.gridx = 0;
        gbc_lblHost.gridy = 0;
        panel.add(lblHost, gbc_lblHost); 
        
        final JTextField resultField = new JTextField(20);
        resultField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        GridBagConstraints gbc_resultField = new GridBagConstraints();
        gbc_resultField.insets = new Insets(0, 0, 5, 5);
        gbc_resultField.gridx = 1;
        gbc_resultField.gridy = 0;
        panel.add(resultField, gbc_resultField);   
        
        frame.getContentPane().add(panel);
        
        JLabel lblPort = new JLabel("Port Name");
        lblPort.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPort.setText("Port:");  
        GridBagConstraints gbc_lblPort = new GridBagConstraints();
        gbc_lblPort.anchor = GridBagConstraints.EAST;
        gbc_lblPort.insets = new Insets(0, 0, 5, 5);
        gbc_lblPort.gridx = 0;
        gbc_lblPort.gridy = 1;
        panel.add(lblPort, gbc_lblPort); 
        
        final JTextField resultField2 = new JTextField(20);
        resultField2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        GridBagConstraints gbc_resultField2 = new GridBagConstraints();
        gbc_resultField2.insets = new Insets(0, 0, 5, 5);
        gbc_resultField2.gridx = 1;
        gbc_resultField2.gridy = 1;
        panel.add(resultField2, gbc_resultField2);  
        
        JLabel lblUser = new JLabel("Username");
        lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUser.setText("Username:");  
        GridBagConstraints gbc_lblUser = new GridBagConstraints();
        gbc_lblUser.anchor = GridBagConstraints.EAST;
        gbc_lblUser.insets = new Insets(0, 0, 5, 5);
        gbc_lblUser.gridx = 0;
        gbc_lblUser.gridy = 2;
        panel.add(lblUser, gbc_lblUser); 
        
        final JTextField resultField3 = new JTextField(20);
        resultField3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        GridBagConstraints gbc_resultField3 = new GridBagConstraints();
        gbc_resultField3.insets = new Insets(0, 0, 5, 5);
        gbc_resultField3.gridx = 1;
        gbc_resultField3.gridy = 2;
        panel.add(resultField3, gbc_resultField3);  
        
        JLabel lblPass = new JLabel("Password");
        lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPass.setText("Password:");  
        GridBagConstraints gbc_lblPass = new GridBagConstraints();
        gbc_lblPass.insets = new Insets(0, 0, 5, 5);
        gbc_lblPass.gridx = 0;
        gbc_lblPass.gridy = 3;
        panel.add(lblPass, gbc_lblPass); 
        
        final JTextField resultField4 = new JTextField(20);
        resultField4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        GridBagConstraints gbc_resultField4 = new GridBagConstraints();
        gbc_resultField4.insets = new Insets(0, 0, 5, 5);
        gbc_resultField4.gridx = 1;
        gbc_resultField4.gridy = 3;
        panel.add(resultField4, gbc_resultField4);  
        
        JLabel lblChan = new JLabel("Channel");
        lblChan.setHorizontalAlignment(SwingConstants.RIGHT);
        lblChan.setText("Channel:");  
        GridBagConstraints gbc_lblChan = new GridBagConstraints();
        gbc_lblChan.anchor = GridBagConstraints.EAST;
        gbc_lblChan.insets = new Insets(0, 0, 0, 5);
        gbc_lblChan.gridx = 0;
        gbc_lblChan.gridy = 4;
        panel.add(lblChan, gbc_lblChan); 
        
        final JTextField resultField5 = new JTextField(20);
        resultField5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        GridBagConstraints gbc_resultField5 = new GridBagConstraints();
        gbc_resultField5.insets = new Insets(0, 0, 0, 5);
        gbc_resultField5.gridx = 1;
        gbc_resultField5.gridy = 4;
        
        panel.add(resultField5, gbc_resultField5);  
        frame.pack();
        frame.setVisible(true);
    }
}
