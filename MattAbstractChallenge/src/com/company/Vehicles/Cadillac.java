package com.company.Vehicles;

import com.company.Abstracts.Engine;
import com.company.Abstracts.Vehicle;
import com.company.VehicleParts.CadillacEngine;
import com.company.VehicleParts.LamboEngine;

public class Cadillac extends Vehicle {

    //Member Constructor
    public Cadillac(byte totalPassengers, CadillacEngine newCadillacEngine) {
        super(totalPassengers, newCadillacEngine);
    }

    //Abstract Methods
    @Override
    public void addPassengerInCar() {

        byte currentPassengerCount = getPassengers();

        if(currentPassengerCount < getTotalPassengers())
            setPassengers( ++currentPassengerCount);
        else
            System.out.println("\nCadillac Car is full");

    }

    @Override
    public void removePassengerInCar() {
        byte currentPassengerCount = getPassengers();

        if(currentPassengerCount > 0)
            setPassengers( --currentPassengerCount);
        else
            System.out.println("\nCadillac Car is empty");
    }

    @Override
    public void accelerate() {

        int speed = getSpeed();

        if (speed < 230)
            setSpeed( speed + 10);
        else
            System.out.println("Cadillac Going max speed");
    }

    @Override
    public void reverse() {

        int speed = getSpeed();

        if (speed > 0)
            setSpeed( speed - 10);
        else
            System.out.println("Cadillac Fully Stopped");

    }

    @Override
    public void stop() {
        setSpeed(0);
    }
}
