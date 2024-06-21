package model.entities;

import enums.Color;

public abstract class Shape {
    private Color color;

    //Builders
    public Shape(){

    }
    public Shape(Color color) {
        this.color = color;
    }

    //Encapsuladors
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Methods
    public abstract double area();
}
