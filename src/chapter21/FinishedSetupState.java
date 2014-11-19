/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter21;

import java.util.*;

public class FinishedSetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;

    public FinishedSetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
    }

    public void previousValue() {
        System.out.println("Ignored...");
    }

    public void nextValue() {
        System.out.println("Ignored...");
    }

    public void selectValue() {
        Calendar selectedDate = clockSetup.getSelectedDate();
        System.out.println("Date set to: " + selectedDate.getTime());
    }

    public String getInstructions() {
        return "Press knob to view selected date...";
    }

    public int getSelectedValue() {
        throw new IllegalStateException("Clock setup finished");
    }
    
}
