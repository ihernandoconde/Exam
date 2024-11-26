package org.example;

import java.awt.*;


public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Point center, Color color) {
        super(center, color);
        this.radius=radius;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(center.x-radius,center.y-radius, radius*2, radius*2);

    }
}
