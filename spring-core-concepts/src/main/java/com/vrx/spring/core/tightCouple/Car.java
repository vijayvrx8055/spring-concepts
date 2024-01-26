package com.vrx.spring.core.tightCouple;

public class Car {

    // hardcoding engine object
    // will have to manually change if other object is to be used.
    Engine engine = new Engine(); // tight coupled

    public void startEngine(){
        //using engine
        engine.run();
    }

}
