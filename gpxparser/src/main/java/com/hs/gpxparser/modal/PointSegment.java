package com.hs.gpxparser.modal;

import java.util.ArrayList;

/**
 * Created by jinliang
 */
public class PointSegment {
    private ArrayList<Point> points;

    public PointSegment() {
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        if (points == null) {
            points = new ArrayList<>();
        }
        points.add(point);
    }
}
