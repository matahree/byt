package com.game.level;

import com.game.mode.Game;

public class Map extends Game {
    private String location;
    private int area;
    private int mapSize;
    private int numberOfLocations;

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public int getNumberOfLocations() {
        return numberOfLocations;
    }

    public void setNumberOfLocations(int numberOfLocations) {
        this.numberOfLocations = numberOfLocations;
    }

    public Map(String location, int area) {
        this.location = location;
        this.area = area;
    }

    public Map() {
        super();
        this.Location = "Unknown";
        this.Area = 0;
        this.mapSize = 0;
        this.numberOfLocations = 0;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void generateArea() {
        // Generate a random location for the map
        double x = Math.random() * 100;
        double y = Math.random() * 100;
        this.location = String.format("(%.2f, %.2f)", x, y);

        // Generate a random area for the map
        int width = (int) (Math.random() * 100);
        int height = (int) (Math.random() * 100);
        this.area = width * height;
    }
}