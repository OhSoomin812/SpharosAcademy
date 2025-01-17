package org.example.knn;

public class Point {

    public String type;
    public double xpos;
    public double ypos;

    public Point(String type, double xpos, double ypos) {
        this.type = type;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(double xpos, double ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
}
