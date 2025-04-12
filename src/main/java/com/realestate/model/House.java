package com.realestate.model;

public class House {
    private String name;
    private double price;
    private int area;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(String name, double price, int area, int numberOfRooms, int numberOfLivingRooms) {
        this.name = name;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return name + " - " + area + " sqm, " + numberOfRooms + " rooms, " + numberOfLivingRooms + " living rooms";
    }
}
