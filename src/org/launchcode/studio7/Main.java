package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD cd = new CD("Nevermind", 23456);
        OpticalDisc dvd = new DVD("Mission Impossible", 456789);

        cd.readData();
        dvd.readData();
    }
}
