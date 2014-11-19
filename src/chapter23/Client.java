/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter23;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("About to print a booklet for saloon cars");
        AbstractBookletPrinter saloonBooklet = new SaloonBooklet();
        saloonBooklet.print();

        System.out.println("About to print a service history booklet");
        AbstractBookletPrinter serviceBooklet = new ServiceHistoryBooklet();
        serviceBooklet.print();
    }
    
}
