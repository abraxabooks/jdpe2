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

public class DaySetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;
    private int day;

    public DaySetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
        day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    public void previousValue() {
        if (day > 1) {
            day--;
        }
    }

    public void nextValue() {
        if (day < Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)) {
            day++;
        }
    }

    public void selectValue() {
        System.out.println("Day set to " + day);
        clockSetup.setState(clockSetup.getHourSetupState());
    }

    public String getInstructions() {
        return "Please set the day...";
    }

    public int getSelectedValue() {
        return day;
    }
    
}
