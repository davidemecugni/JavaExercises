package oop.shape;

import java.awt.*;

public class Circle extends AbstractShape{
    Point center;
    double radius;

    public Circle(String id, String color, Point center, double radius) {
        super(id, color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return  radius * 2 * Math.PI;
    }

    @Override
    public void move(Point p) {
        center.translate(p.x,p.y);
    }

    @Override
    public void resize(double s) {
        radius *= s;
    }
}
