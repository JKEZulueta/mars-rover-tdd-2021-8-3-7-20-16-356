package com.afs.tdd;

public class Application {


    private RoverStatus roverStatus;

    public Application(RoverStatus roverStatus) {

        this.roverStatus = roverStatus;
    }



    public void executeCommand(String command){

    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
