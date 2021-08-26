package com.company;

import com.company.Abstracts.Engine;
import com.company.VehicleParts.CadillacEngine;
import com.company.VehicleParts.LamboEngine;
import com.company.Vehicles.Cadillac;
import com.company.Vehicles.Lambo;

public class Main {

    public static void main(String[] args) {




        //Engine Model Instances
        CadillacEngine cadillacEngine = new CadillacEngine("v6", 4.0);
        LamboEngine lamboEngine = new LamboEngine("V12",5.2);

        //Vehicle Body Instances
        Cadillac cadillac = new Cadillac((byte)4, cadillacEngine);
        Lambo lamborguini = new Lambo((byte)2, lamboEngine);



        //Passenger Method Test
        System.out.println("\n------------Beginning of PASSENGER TEST-------------------\n\n");

        System.out.println("Lambo Passengers: " + lamborguini.getPassengers() + " MAX: " + lamborguini.getTotalPassengers());
        System.out.println("Cadillac Passengers: " + cadillac.getPassengers()+ "MAX: " + cadillac.getTotalPassengers());


        System.out.println("\nAdded a Passenger");
        lamborguini.addPassengerInCar();
        cadillac.addPassengerInCar();

        System.out.println("Lambo Passengers: " + lamborguini.getPassengers() + " MAX: " + lamborguini.getTotalPassengers());
        System.out.println("Cadillac Passengers: " + cadillac.getPassengers()+ " MAX: " + cadillac.getTotalPassengers());


        System.out.println("\nAdded a Passenger");
        lamborguini.addPassengerInCar();
        cadillac.addPassengerInCar();

        System.out.println("Lambo Passengers: " + lamborguini.getPassengers() + " MAX: " + lamborguini.getTotalPassengers());
        System.out.println("Cadillac Passengers: " + cadillac.getPassengers()+ " MAX: " + cadillac.getTotalPassengers());


        System.out.println("\nAdded a Passenger");
        lamborguini.addPassengerInCar();
        cadillac.addPassengerInCar();

        System.out.println("Lambo Passengers: " + lamborguini.getPassengers() + " MAX: " + lamborguini.getTotalPassengers());
        System.out.println("Cadillac Passengers: " + cadillac.getPassengers()+ " MAX: " + cadillac.getTotalPassengers());

        System.out.println("\n------------END of PASSENGER TEST-------------------\n\n");









        //Speed Method Test
        System.out.println("\n------------Beginning of Speed TEST-------------------\n\n");

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\nAccelerated");
        lamborguini.accelerate();
        cadillac.accelerate();

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\nAccelerated");
        lamborguini.accelerate();
        cadillac.accelerate();

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\n------------END of Speed TEST-------------------\n\n");





        //Braking Speed Test
        System.out.println("\n------------Beginning of Braking TEST-------------------\n\n");

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\nBraking Power");
        lamborguini.reverse();
        cadillac.reverse();

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\nSTOP");
        lamborguini.stop();
        cadillac.stop();

        System.out.println("Lambo Speed: " + lamborguini.getSpeed());
        System.out.println("Cadillac Speed: " + cadillac.getSpeed());

        System.out.println("\nBraking Power");
        lamborguini.reverse();
        cadillac.reverse();

        System.out.println("\n------------END of Braking TEST-------------------\n\n");





	// write your code here

        /*
Challenge for Abstract Classes and Methods:

Create a program focusing on Vehicles
Required Classes: Vehicle, Engine
Each Vehicle Class should contain one Engine
Each Vehicle Class should contain methods to:
    Start/Stop
    Add Passengers
    Remove Passengers

Basic Requirements:
At least one Abstract Class
At least two Abstract Methods
 */
    }
}
