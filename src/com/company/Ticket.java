package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by rudi on 12/1/2015.
 */
public class Ticket extends JFrame {

    private JPanel rootPanel;
    private JButton addTicketButton;
    private JButton sortTicketsButton;
    private JList TicketList;
    private JButton createTicketButton;
    private JTextField TicketEntryTextField;
    private JLabel ticketMessage;
    private JTextField ticketEntryTextField;
    private DefaultListModel<String> ticketQueue;

    DefaultListModel<String> TicketListModel;


    Ticket() {
        super("Ticket Program");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TicketListModel = new DefaultListModel<>();
        TicketList.setModel(TicketListModel);


        LinkedList<Ticket> ticketQueue = new LinkedList<Ticket>();
        // Trying to create ticket
        createTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticketMessage.setText("Create a ticket, please.");
                String tick = TicketEntryTextField.getText();
                TicketList.add(ticketEntryTextField);
            }
        });

        // trying to add ticket to TicketList
        addTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TicketList.add();
            }
        });

        // Add ActionListener to sort tickets by priority
        sortTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Collections.sort(ticketQueue);
            }
        });
    }
}


