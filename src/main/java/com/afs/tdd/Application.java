package com.afs.tdd;

public class Application {


    private RoverStatus roverStatus;

    public Application(RoverStatus roverStatus) {

        this.roverStatus = roverStatus;
    }



    public void executeCommand(String command){
        switch(command){
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
        }

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if (direction.equals("N")){
            newDirection = "E";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);

    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if (direction.equals("N")){
            newDirection = "W";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void move() {
        int locationX = roverStatus.getLocationX();
        int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if(direction.equals("N")){
            locationY++;
        } else if (direction.equals("S")){
            locationY--;
        }

        roverStatus = new RoverStatus(locationX, locationY, direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
