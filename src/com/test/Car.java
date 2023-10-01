package com.test;

import com.test.parts.CarEngine;

public class Car {
    private CarEngine engine;
    private int numberOfWheels;
    private String name;

    public Car(CarEngine engine, int numberOfWheels, String name) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
        this.name = name;
    }

    public String startEngine(){
        return "Vroom vroom";
    }

    public String applyBreak(){
        return "eeehh";
    }

    public void carModel(){
        System.out.println(name+ " " + engine);
    }

    public void setName(String newName){
        name = newName;
    }

    public Car makeCopy(){
       return new Car(engine,numberOfWheels,name);
    }

}
