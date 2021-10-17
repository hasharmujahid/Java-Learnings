package com.company;

public class Tesla extends Car {
    private String mode;
    private String runon;
    private int Capacityoncharge;

    public Tesla(String transmision, String engine, int gear, int doors, String mode, String runon, int capacityoncharge) {
        super(transmision, engine,4, gear, doors);
        this.mode = mode;
        this.runon = runon;
        Capacityoncharge = capacityoncharge;
    }
}
