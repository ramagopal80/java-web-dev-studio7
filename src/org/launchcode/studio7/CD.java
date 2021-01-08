package org.launchcode.studio7;

import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class CD extends BasicDisc implements OpticalDisc{
    public CD(String name, int storageCaoacity){
        super(name, storageCaoacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at 5400 rpm");
    }

    @Override
    public void readData() {
        System.out.println("This is a music CD");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
