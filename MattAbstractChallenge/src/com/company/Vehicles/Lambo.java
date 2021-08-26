package com.company.Vehicles;

import com.company.Abstracts.Engine;
import com.company.Abstracts.Vehicle;
import com.company.VehicleParts.LamboEngine;

public class Lambo extends Vehicle {

    //Member Constructor
    public Lambo(byte totalPassengers, LamboEngine newLamboEngine) {
        super(totalPassengers, newLamboEngine);
    }


    //Abstract Methods
    @Override
    public void addPassengerInCar() {

        byte currentPassengerCount = getPassengers();

        if(currentPassengerCount < getTotalPassengers())
            setPassengers( ++currentPassengerCount);
        else
            System.out.println("Lambo Car is full");

    }

    @Override
    public void removePassengerInCar() {
        byte currentPassengerCount = getPassengers();

        if(currentPassengerCount > 0)
            setPassengers( --currentPassengerCount);
        else
            System.out.println("Lambo Car is empty");
    }

    @Override
    public void accelerate() {

        int speed = getSpeed();

        if (speed < 230)
            setSpeed( speed + 40);
        else
            System.out.println("Lambo Going max speed");
    }

    @Override
    public void reverse() {

        int speed = getSpeed();

        if (speed > 0)
            setSpeed( speed - 40);
        else
            System.out.println("Lambo Fully Stopped");

    }

    @Override
    public void stop() {
        setSpeed(0);
    }
}
