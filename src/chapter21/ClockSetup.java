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

public class ClockSetup {
    
    // The various states the setup can be in...
    private ClockSetupState yearState;
    private ClockSetupState monthState;
    private ClockSetupState dayState;
    private ClockSetupState hourState;
    private ClockSetupState minuteState;
    private ClockSetupState finishedState;
    
    // The current state we are in...
    private ClockSetupState currentState;
    
    public ClockSetup() {
        yearState = new YearSetupState(this);
        monthState = new MonthSetupState(this);
        dayState = new DaySetupState(this);
        hourState = new HourSetupState(this);
        minuteState = new MinuteSetupState(this);
        finishedState = new FinishedSetupState(this);
        
        // Initial state is set to the year
        setState(yearState);
    }
    
    public void setState(ClockSetupState state) {
        currentState = state;
        System.out.println(currentState.getInstructions());
    }
    
    public void rotateKnobLeft() {
        currentState.previousValue();
    }
    
    public void rotateKnobRight() {
        currentState.nextValue();
    }
    
    public void pushKnob() {
        currentState.selectValue();
    }
    
    public ClockSetupState getYearSetupState() {
        return yearState;
    }
    
    public ClockSetupState getMonthSetupState() {
        return monthState;
    }
    
    public ClockSetupState getDaySetupState() {
        return dayState;
    }
    
    public ClockSetupState getHourSetupState() {
        return hourState;
    }
    
    public ClockSetupState getMinuteSetupState() {
        return minuteState;
    }
    
    public ClockSetupState getFinishedSetupState() {
        return finishedState;
    }
    
    public Calendar getSelectedDate() {
        return new GregorianCalendar(
                yearState.getSelectedValue(),
                monthState.getSelectedValue(),
                dayState.getSelectedValue(),
                hourState.getSelectedValue(),
                minuteState.getSelectedValue());
    }
    
}
