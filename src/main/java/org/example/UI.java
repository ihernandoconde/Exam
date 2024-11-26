package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

public class UI {
    static GraphicsConfiguration gc;
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setVisible(true);
        //Phase 1 information upload
        ArrayList<Keeper> keepers = new ArrayList<Keeper>();
        ArrayList<Lion> lions= new ArrayList<Lion>();
        ArrayList<Drone> drones= new ArrayList<Drone>();
        Keeper keeper1= new Keeper("Geoff", "4392",80);
        keepers.add(keeper1);
        Lion lion1= new Lion("Simba", 7, 30);
        lions.add(lion1);
        Drone drone1= new Drone("Monitor1",128,124);
        drones.add(drone1);

        //Create map and add to frame
        Map map1= new Map(lions, drones, keepers);
        Alert alert1=new Alert (lions, drones, keepers);
        JPanel panel= new JPanel(new GridLayout(1,1));
        frame.getContentPane().add(panel);
        panel.add(map1);


        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
