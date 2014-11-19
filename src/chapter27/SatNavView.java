/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter27;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class SatNavView implements PropertyChangeListener {
    
    // The view needs a reference to the model
    private SatNavModel model;
    
    // The view uses a JFrame
    private JFrame viewingFrame;
    
    // UI controls to change direction and speed
    private JButton northButton, southButton, westButton, eastButton;
    private JSlider speedSlider;
    
    // UI feedback to show current direction and speed
    private String directionString, speedString;
    private JLabel feedbackLabel;
    
    
    public SatNavView(SatNavModel model) {
        this.model = model;
        
        // The view listens for changes to the model
        model.addPropertyChangeListener(this);
        
        // Initialise the UI
        viewingFrame = new JFrame("Satellite Navigation");
        viewingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        northButton = new JButton("North");
        disableNorthButton();  // default direction

        southButton = new JButton("South");
        westButton = new JButton("West");
        eastButton = new JButton("East");
        
        speedSlider = new JSlider(JSlider.VERTICAL, 0, 30, 0);
        speedSlider.setMajorTickSpacing(10);
        speedSlider.setMinorTickSpacing(1);
        speedSlider.setPaintLabels(true);
        speedSlider.setPaintLabels(true);
        
        directionString = "You are pointing " + model.getDirection();
        speedString = "but not yet moving. Use buttons & slider";
        feedbackLabel = new JLabel(directionString + ", " + speedString);
        
        // Layout the direction buttons
        JPanel directionPanel = new JPanel(new GridLayout(3, 2));
        directionPanel.setBorder(new TitledBorder("Direction"));
        directionPanel.add(new JLabel(""));
        directionPanel.add(northButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(westButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(eastButton);
        directionPanel.add(new JLabel(""));
        directionPanel.add(southButton);
        directionPanel.add(new JLabel(""));
        
        // Layout the slider
        JPanel speedPanel = new JPanel();
        speedPanel.setBorder(new TitledBorder("Speed"));
        speedPanel.add(speedSlider);
        
        // Layout the feedback
        JPanel feedbackPanel = new JPanel();
        feedbackPanel.setBorder(new TitledBorder("Feedback"));
        feedbackPanel.add(feedbackLabel);
        
        // Position the panels onto the frame
        JPanel framePanel = new JPanel(new BorderLayout());
        framePanel.add(directionPanel, BorderLayout.CENTER);
        framePanel.add(speedPanel, BorderLayout.EAST);
        framePanel.add(feedbackPanel, BorderLayout.SOUTH);
        
        viewingFrame.add(framePanel);
    }
    
    public void show() {
        // Show the view sized and centered
        viewingFrame.pack();
        viewingFrame.setLocationRelativeTo(null);
        viewingFrame.setVisible(true);
    }
    
    // The controller will register as a listener using these methods
    public void addNorthButtonListener(ActionListener al) {
        northButton.addActionListener(al);
    }

    public void addSouthButtonListener(ActionListener al) {
        southButton.addActionListener(al);
    }

    public void addWestButtonListener(ActionListener al) {
        westButton.addActionListener(al);
    }

    public void addEastButtonListener(ActionListener al) {
        eastButton.addActionListener(al);
    }

    public void addSliderListener(ChangeListener cl) {
        speedSlider.addChangeListener(cl);
    }
    
    // The controller will call these methods to enable UI controls
    public void enableNorthButton() {
        northButton.setEnabled(true);
    }

    public void disableNorthButton() {
        northButton.setEnabled(false);
    }

    public void enableSouthButton() {
        southButton.setEnabled(true);
    }

    public void disableSouthButton() {
        southButton.setEnabled(false);
    }
    
    public void enableWestButton() {
        westButton.setEnabled(true);
    }

    public void disableWestButton() {
        westButton.setEnabled(false);
    }
    
    public void enableEastButton() {
        eastButton.setEnabled(true);
    }

    public void disableEastButton() {
        eastButton.setEnabled(false);
    }
    
    // Called by the model when its state changes
    public void propertyChange(PropertyChangeEvent pce) {
        if (model.getSpeed() == 0) {
            directionString = "You are pointing " + 
                    model.getDirection();
            speedString = "but are not currently moving";
            
        } else if (pce.getPropertyName().equals(SatNavModel.DIRECTION_CHANGE)) {
            SatNavModel.Direction newDirection =
                    (SatNavModel.Direction) pce.getNewValue();
            directionString = "Now travelling " + newDirection;
            speedString = "travelling at " + model.getSpeed();
            
        } else if (pce.getPropertyName().equals(SatNavModel.SPEED_CHANGE)) {
            int oldSpeed = (Integer) pce.getOldValue();
            int newSpeed = (Integer) pce.getNewValue();
            if (oldSpeed < newSpeed) {
                speedString = "and you have sped up to " + model.getSpeed();
            } else {
                speedString = "and you have slowed down to " + model.getSpeed();
            }
        }
        
        feedbackLabel.setText(directionString + ", " + speedString);
    }
    
}
