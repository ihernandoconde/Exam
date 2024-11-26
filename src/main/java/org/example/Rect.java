package org.example;

import java.awt.*;


public class Rect extends Shape {
    private int width;
    private int height;

    public Rect(Point center, Color color, int width, int height) {
        super(center,color);
        this.width=width;
        this.height=height;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(center.x, center.y, width, height);

    }
}