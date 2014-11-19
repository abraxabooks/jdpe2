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

public class MonthSetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;
    private int month;

    public MonthSetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
        month = Calendar.getInstance().get(Calendar.MONTH);
    }

    public void previousValue() {
        if (month > 0) {
            month--;
        }
    }

    public void nextValue() {
        if (month < 11) {
            month++;
        }
    }

    public void selectValue() {
        System.out.println("Month set to " + (month + 1));
        clockSetup.setState(clockSetup.getDaySetupState());
    }

    public String getInstructions() {
        return "Please set the month...";
    }

    public int getSelectedValue() {
        return month;
    }
    
}
