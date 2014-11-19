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

public class MinuteSetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;
    private int minute;

    public MinuteSetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
        minute = Calendar.getInstance().get(Calendar.MINUTE);
    }

    public void previousValue() {
        if (minute > 0) {
            minute--;
        }
    }

    public void nextValue() {
        if (minute < 59) {
            minute++;
        }
    }

    public void selectValue() {
        System.out.println("Minute set to " + minute);
        clockSetup.setState(clockSetup.getFinishedSetupState());
    }

    public String getInstructions() {
        return "Please set the minute...";
    }

    public int getSelectedValue() {
        return minute;
    }
    
}
