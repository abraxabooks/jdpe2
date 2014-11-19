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

public class HourSetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;
    private int hour;

    public HourSetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
        hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public void previousValue() {
        if (hour > 0) {
            hour--;
        }
    }

    public void nextValue() {
        if (hour < 23) {
            hour++;
        }
    }

    public void selectValue() {
        System.out.println("Hour set to " + hour);
        clockSetup.setState(clockSetup.getMinuteSetupState());
    }

    public String getInstructions() {
        return "Please set the hour...";
    }

    public int getSelectedValue() {
        return hour;
    }
    
}
