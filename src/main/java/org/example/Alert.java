package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Alert {
    public Alert(ArrayList<Lion> Lions, ArrayList<Drone> Drones, ArrayList<Keeper>Keepers) throws IOException {
        for (Drone d:Drones){
            for (Keeper k:Keepers){
                double distance= Math.hypot(d.getLocation().x-k.getLocation().x, d.getLocation().y-k.getLocation().y);
                if (distance<60){
                    d.alert();
                    k.alert();
                }
            }

        }

    }
}
