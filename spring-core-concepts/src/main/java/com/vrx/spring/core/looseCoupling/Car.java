package com.vrx.spring.core.looseCoupling;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car is running....");
    }
}
