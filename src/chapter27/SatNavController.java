/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter27;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SatNavController {
    
    // Need a reference to both the model and the view
    private SatNavModel model;
    private SatNavView view;
    
    
    public SatNavController(SatNavModel model, SatNavView view) {
        this.model = model;
        this.view = view;
        
        // The controller needs to listen to the view
        view.addNorthButtonListener(new NorthButtonListener());
        view.addSouthButtonListener(new SouthButtonListener());
        view.addWestButtonListener(new WestButtonListener());
        view.addEastButtonListener(new EastButtonListener());
        view.addSliderListener(new SliderListener());
    }
    
    
    // Inner classess which server as view listeners
    private class NorthButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            view.disableNorthButton();
            view.enableSouthButton();
            view.enableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.NORTH);
        }
    }

    private class SouthButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            view.enableNorthButton();
            view.disableSouthButton();
            view.enableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.SOUTH);
        }
    }

    private class WestButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            view.enableNorthButton();
            view.enableSouthButton();
            view.disableWestButton();
            view.enableEastButton();
            model.setDirection(SatNavModel.Direction.WEST);
        }
    }

    private class EastButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            view.enableNorthButton();
            view.enableSouthButton();
            view.enableWestButton();
            view.disableEastButton();
            model.setDirection(SatNavModel.Direction.EAST);
        }
    }
    
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent event) {
            JSlider slider = (JSlider) event.getSource();
            model.setSpeed(slider.getValue());
        }
    }
    
}
