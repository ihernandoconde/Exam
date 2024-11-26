package org.example;

import java.awt.*;
import java.io.IOException;
import java.rmi.ConnectIOException;
import java.util.ArrayList;

public class Map extends Canvas {
    private  ArrayList<Lion> Lions1;
    private  ArrayList<Drone> Drones1;
    private  ArrayList<Keeper> Keepers1;

    private Locate location;
    private ArrayList<Shape> shapes;
    private ArrayList<Lion> lions1;

    public  Map (ArrayList<Lion> Lions, ArrayList<Drone> Drones, ArrayList<Keeper>Keepers) throws IOException {
        this.Lions1 = Lions;
        this.Drones1 = Drones;
        this.Keepers1 = Keepers;
        Locate location= new Locate(Lions, Drones, Keepers);
        this.location = location;
        shapes=location.getShapes();
        //try{Thread.sleep(1000);}
        //catch (Exception e){}

    }
    public void paint(Graphics g) {
        for (Shape s:shapes){
            s.draw(g);
        }
        for (Lion l:Lions1){
            try {
                g.drawString(l.getName()+"\n"+l.getAge(),l.getLocation().x+4,l.getLocation().y+4);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (Drone d:Drones1){
            try {
                g.drawString(d.getName()+"\n"+d.getFreq(),d.getLocation().x+4,d.getLocation().y+4);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (Keeper k:Keepers1){
            try {
                g.drawString(k.getName()+"\n"+k.getPhoneNumber(),k.getLocation().x+4,k.getLocation().y+4);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
