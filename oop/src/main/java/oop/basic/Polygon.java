package oop.basic;

import java.awt.geom.Point2D;

public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices){
        if(vertices.length < 3){
            throw new IllegalArgumentException("Three vertices are required");
        }
        this.vertices = vertices;
    }

    public int getVerticesCount(){
        return vertices.length;
    }

    public double getPerimeter(){
        double perimeter = 0;
        int i = 0;
        while (i < vertices.length - 1) {
            perimeter += vertices[i].distance(vertices[i + 1]);
            i++;
        }
        perimeter += vertices[i].distance(vertices[0]);
        return perimeter;
    }

    public double getArea(){
        double area = 0;
        int i = 0;
        while (i < vertices.length - 1) {
            area += vertices[i].x * vertices[i + 1].y - vertices[i].y * vertices[i + 1].x;
            i++;
        }
        area += vertices[i].x * vertices[0].y + vertices[i].y * vertices[0].x;
        return Math.abs(area / 2);
    }
}
