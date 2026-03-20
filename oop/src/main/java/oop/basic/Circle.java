package oop.basic;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public boolean contains(Point point){
        /*double dist = Math.pow(point.x - center.x, 2) + Math.pow(point.x - point.y, 2);
        return Math.sqrt(dist) < radius;*/
        return center.distance(point) < radius;
    }

    public void translate(int dx, int dy){
        /*center.x += dx;
        center.y += dy;*/
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
