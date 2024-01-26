package com.vrx.spring.core.looseCoupling;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus is running...");
    }
}
