package com.java;

public enum Planet {
    MERKUR(1, 0.39, 0.38, 58.6),
    VENUS(2, 0.72, 0.95, -243),
    DUNYA(3, 1, 1, 1),
    MARS(4, 1.52, 0.53, 24.6),
    JUPITER(5, 5.2, 11.2, 9.9),
    SATURN(6, 9.58, 9.45, 10.7),
    URANUS(7, 19.22, 4.0, -17.2),
    NEPTUN(8, 30.05, 3.88, 16.1);

    private int sortingNumber;
    private double distance;
    private double radius;
    private double rotationTime;

    Planet(int sortingNumber, double distance, double radius, double rotationTime) {
        this.sortingNumber = sortingNumber;
        this.distance = distance;
        this.radius = radius;
        this.rotationTime = rotationTime;
    }

    public int getSortingNumber() {
        return sortingNumber;
    }

    public double getDistance() {
        return distance;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationTime() {
        return rotationTime;
    }
}
