package it.unibo.shapes.impl;
import it.unibo.shapes.api.Shape;
import java.lang.Math;
public class Circle implements Shape{
    final Double pi = Math.PI;
    double raggio;

    public Circle(double raggio) {
        this.raggio = raggio;
    }
    public Double getPerimeter() {
        return 2*raggio*pi;
    }

    public Double getArea() {
        return pi*(Math.pow(raggio, 2));
    }
    
}
