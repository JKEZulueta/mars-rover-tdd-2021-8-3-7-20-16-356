package com.afs.tdd;

public class Application {


    private RoverStatus roverStatus;

    public Application(RoverStatus roverStatus) {

        this.roverStatus = roverStatus;
    }



    public void executeCommand(String command){
        if(command.equals("M")){
            move();
        }
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        roverStatus = new RoverStatus(locationX, locationY + 1, direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
