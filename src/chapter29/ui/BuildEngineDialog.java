/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter29.ui;

import chapter29.business.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BuildEngineDialog extends JDialog {
    
    private JComboBox typeCombo, sizeCombo;
    
    BuildEngineDialog(Frame owner) {
        super(owner, "Build Engine", true);
        setLayout(new BorderLayout());
        this.setLocationRelativeTo(owner);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        // Form entry panel
        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        
        typeCombo = new JComboBox
                (BusinessFacade.INSTANCE.getEngineTypes());
        formPanel.add(new JLabel("Type"));
        formPanel.add(typeCombo);
        
        sizeCombo = new JComboBox();
        sizeCombo.addItem(1300);
        sizeCombo.addItem(1600);
        sizeCombo.addItem(2000);
        sizeCombo.addItem(2500);
        formPanel.add(new JLabel("Size"));
        formPanel.add(sizeCombo);
        
        add(formPanel, BorderLayout.CENTER);
        
        // Buttons to submit or cancel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                BusinessFacade.INSTANCE.addEngine(
                        (Integer)sizeCombo.getSelectedItem(),
                        typeCombo.getSelectedItem());
                setVisible(false);
            }
        });
        buttonPanel.add(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                setVisible(false);
            }
        });
        buttonPanel.add(cancelButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }
}
