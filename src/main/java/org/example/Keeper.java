package org.example;

import java.awt.*;
import java.io.IOException;

public class Keeper implements Contactable {
    private String name;
    private String PhoneNumber;
    private int GPSTag;
    public Keeper(String name, String PhoneNumber, int GPSTag) {
        this.name=name;
        this.PhoneNumber=PhoneNumber;
        this.GPSTag=GPSTag;
    }
    public void alert(){
        AlertSystem.alertAKeeper(PhoneNumber);
    }
    public Point getLocation() throws IOException {
        return LocationSystem.getCoords(GPSTag);
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
