package org.example;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Locate {
    private ArrayList<Shape> shapes;
    public Locate(ArrayList<Lion> Lions, ArrayList<Drone> Drones, ArrayList<Keeper>Keepers) throws IOException {
        shapes = new ArrayList<Shape>();
        for (Lion l:Lions){
            Circle Lion1= new Circle (3, l.getLocation(), Color.RED);
            shapes.add(Lion1);
        }
        for (Drone d:Drones){
            Square Drone1= new Square (3, d.getLocation(), Color.BLACK);
            shapes.add(Drone1);
        }
        for (Keeper k:Keepers){
            Circle Keeper1= new Circle (2, k.getLocation(), Color.BLUE);
            shapes.add(Keeper1);
        }

    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
