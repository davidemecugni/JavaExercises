package oop.basic;

import java.awt.*;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public boolean contains(Point p){
        double dst = Math.sqrt(Math.pow(p.getX() - this.center.getX(), 2) + Math.pow(p.getY() - this.center.getY(),2));
        return dst <= this.radius;
    }

    public void translate(int dx, int dy){
        this.center.setLocation(this.center.getX() + dx , this.center.getY() + dy);
    }
}
