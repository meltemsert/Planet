package com.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("planets in the solar system");
        System.out.println("----------");

        for(Planet planet:Planet.values()){
            System.out.println("Sorting Number: " + planet.getSortingNumber());
            System.out.println("Distance: " + planet.getDistance());
            System.out.println("Radius: " + planet.getRadius());
            System.out.println("Rotation Time: " + planet.getRotationTime());
            System.out.println("----------");

        }
    }
}