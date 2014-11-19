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

public class YearSetupState implements ClockSetupState {
    
    private ClockSetup clockSetup;
    private int year;

    public YearSetupState(ClockSetup clockSetup) {
        this.clockSetup = clockSetup;
        year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void previousValue() {
        year--;
    }

    public void nextValue() {
        year++;
    }

    public void selectValue() {
        System.out.println("Year set to " + year);
        clockSetup.setState(clockSetup.getMonthSetupState());
    }

    public String getInstructions() {
        return "Please set the year...";
    }

    public int getSelectedValue() {
        return year;
    }
    
}
