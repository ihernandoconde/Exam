package org.example;

import java.awt.*;
import java.io.IOException;

public class Drone implements Contactable {
    private String name;
    private int Freq;
    private int GPSTag;
    public Drone(String name, int Freq, int GPSTag) {
        this.name=name;
        this.Freq=Freq;
        this.GPSTag=GPSTag;
    }
    public void alert(){
        AlertSystem.alertADrone(Freq);
    }
    public Point getLocation() throws IOException {
        try {
            LocationSystem.getCoords(GPSTag);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return LocationSystem.getCoords(GPSTag);
    }
    public String getName() {
        return name;
    }
    public String getFreq() {
        return String.valueOf(Freq);
    }
}
