package org.example;

import java.awt.*;

public abstract class Shape implements DrawInterface {
    protected Point center;
    protected Color color;

    public Shape(Point center, Color color) {
        this.center = center;
        this.color=color;
    }

    public abstract void draw(Graphics g);
}
