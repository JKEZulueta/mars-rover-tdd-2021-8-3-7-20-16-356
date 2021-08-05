package com.afs.tdd;

public class RoverStatus {

    private final String direction;
    private final int locationY;
    private final int locationX;

    public RoverStatus(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public int getLocationY() {
        return locationY;
    }

    public int getLocationX() {
        return locationX;
    }
}
