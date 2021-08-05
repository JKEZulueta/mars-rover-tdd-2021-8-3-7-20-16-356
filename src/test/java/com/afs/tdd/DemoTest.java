package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {

        //given
        Application marsRover = new Application(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");

        //when
        marsRover.executeCommand("M");

        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());

    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_L() {
        //given
        Application marsRover = new Application(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        marsRover.executeCommand("L");

        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_N_and_R() {
        Application marsRover = new Application(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        marsRover.executeCommand("R");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_negative_1_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_S_and_M() {
        Application marsRover = new Application(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,-1,"S");

        marsRover.executeCommand("M");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_S_and_L() {
        Application marsRover = new Application(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        marsRover.executeCommand("L");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_S_and_R() {
        Application marsRover = new Application(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        marsRover.executeCommand("R");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_and_M() {
        Application marsRover = new Application(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1,0,"E");

        marsRover.executeCommand("M");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_E_and_L() {
        Application marsRover = new Application(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");

        marsRover.executeCommand("L");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());

    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_E_and_R() {
        Application marsRover = new Application(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        marsRover.executeCommand("R");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_negative_1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_and_M() {
        Application marsRover = new Application(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        marsRover.executeCommand("M");

        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
}
