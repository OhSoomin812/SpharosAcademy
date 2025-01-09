package org.example.knn;

import org.example.knn.Point;

public class PointMain {
    public static double calcDistance(Point p1, Point p2) {
        double result = 0;

        result = Math.sqrt(
                Math.pow(p2.xpos - p1.xpos, 2) +
                        Math.pow(p2.ypos - p1.ypos, 2)
        );

        return result;
    }

    public static void main(String[] args) {

        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(5.0, 5.0);

        double distance = calcDistance(p1, p2);
        System.out.println(distance);
    }
}
