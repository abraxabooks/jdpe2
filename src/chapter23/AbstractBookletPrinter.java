/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter23;

public abstract class AbstractBookletPrinter {
    
    protected abstract int getPageCount();
    protected abstract void printFrontCover();
    protected abstract void printTableOfContents();
    protected abstract void printPage(int pageNumber);
    protected abstract void printIndex();
    protected abstract void printBackCover();
    
    // This is the 'template method'
    public final void print() {
        printFrontCover();
        printTableOfContents();
        for (int i = 1; i <= getPageCount(); i++) {
            printPage(i);
        }
        printIndex();
        printBackCover();
    }
    
}
