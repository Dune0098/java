package oop.basic;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        /*
        Main ClickCounter
        ClickCounter c = new ClickCounter();
        for(int i = 0; i < 10; i++){
            c.click();
        }
        System.out.println(c.getValue());
        for (int i = 0; i < 5; i++) {
            c.undo();
        }
        System.out.println(c.getValue());
        c.reset();
        System.out.println(c.getValue());*/

        /*Main RationalNumber
        RationalNumber r = new RationalNumber(5, 6);
        System.out.println(r);
        RationalNumber res = r.add(new RationalNumber(3, 2));
        System.out.println(res);
        int x = r.hashCode();
        System.out.println(x);*/

        /*// Main Circle.
        Circle c = new Circle(new Point(1,1), 3);
        System.out.println(c);*/

        /*Main Polygon
        Polygon square = new Polygon(new Point2D.Double[]{new Point2D.Double(0,0), new Point2D.Double(0, 10), new Point2D.Double(10,10), new Point2D.Double(10, 0)});
        Polygon triangle = new Polygon(new Point2D.Double[]{new Point2D.Double(0,0), new Point2D.Double(10, 0), new Point2D.Double(5,10)});
        Polygon oddlyPoly = new Polygon(new Point2D.Double[]{
                new Point2D.Double(0,0), new Point2D.Double(0,2), new Point2D.Double(1,2), new Point2D.Double(1,6),
                new Point2D.Double(0,6), new Point2D.Double(0,8), new Point2D.Double(3,8), new Point2D.Double(3,6),
                new Point2D.Double(5,6), new Point2D.Double(5,8), new Point2D.Double(8,8), new Point2D.Double(8,6),
                new Point2D.Double(7,6), new Point2D.Double(7,2), new Point2D.Double(8,2), new Point2D.Double(8,0),
                new Point2D.Double(5,0), new Point2D.Double(5,2), new Point2D.Double(3,2), new Point2D.Double(3,0)});
        System.out.println(oddlyPoly.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());*/

        /*Main EnhancedResizableArray
        EnhancedResizableArray e = new EnhancedResizableArray();
        e.set(5, 25);
        System.out.println(e.length());*/

        Letter letter = new Letter("me", "you");
        letter.addLine("Hello");
        letter.addLine("World!");
        System.out.println(letter.getText());
    }
}
