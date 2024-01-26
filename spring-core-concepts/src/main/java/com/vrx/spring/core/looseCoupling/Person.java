package com.vrx.spring.core.looseCoupling;

public class Person {

    Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void useVehicle(){
        vehicle.run();
    }
}
