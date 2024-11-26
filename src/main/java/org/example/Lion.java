package org.example;

import java.awt.*;
import java.io.IOException;

public class Lion {
    private String name;
    private int age;
    private int GPSTag;
    public Lion(String name, int age, int GPSTag) {
        this.name=name;
        this.age=age;
        this.GPSTag=GPSTag;
    }
    public Point getLocation() throws IOException {
        return LocationSystem.getCoords(GPSTag);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
