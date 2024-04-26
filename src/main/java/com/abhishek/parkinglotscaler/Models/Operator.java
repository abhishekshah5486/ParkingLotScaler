package com.abhishek.parkinglotscaler.Models;

public class Operator extends BaseModel{
    private String name;
    private Gate gate;
    private int emoployeeID;
    private ParkingFloor parkingFloor;

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmoployeeID() {
        return emoployeeID;
    }

    public void setEmoployeeID(int emoployeeID) {
        this.emoployeeID = emoployeeID;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
