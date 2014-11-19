/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter23;

public class SaloonBooklet extends AbstractBookletPrinter {

    protected int getPageCount() {
        return 100;
    }

    protected void printFrontCover() {
        System.out.println("Printing front cover for Saloon car booklet");
    }

    protected void printTableOfContents() {
        System.out.println("Printing table of contents for Saloon car booklet");
    }

    protected void printPage(int pageNumber) {
        System.out.println("Printing page " + pageNumber + " for Saloon car booklet");
    }

    protected void printIndex() {
        System.out.println("Printing index for Saloon car booklet");
    }

    protected void printBackCover() {
        System.out.println("Printing back cover for Saloon car booklet");
    }
    
}
