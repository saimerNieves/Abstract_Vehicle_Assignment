package com.company.Abstracts;


public abstract class Vehicle  {

    //Member Data
    private int speed;
    private Engine engine;
    private final byte totalPassengers;
    private byte passengers;



    //Member Constructor
    protected Vehicle(byte totalPassengers, Engine newEngine) {

        setSpeed(0);
        setEngine( newEngine);
        this.totalPassengers = totalPassengers;
    }



    //Member Getters and Setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public byte getTotalPassengers() {
        return totalPassengers;
    }

    public byte getPassengers() {
        return passengers;
    }

    public void setPassengers(byte passengers) {
        this.passengers = passengers;
    }



    //Member Behavior
    public abstract void addPassengerInCar();

    public abstract void removePassengerInCar();

    public abstract void accelerate();

    public abstract void reverse();

    public abstract void stop();


}
