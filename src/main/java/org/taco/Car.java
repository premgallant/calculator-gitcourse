package org.taco

public class Car {

    private String model;
    private String engineType;

    public Car(String model, String engineType) {
        this.model = model;
        this.engineType = engineType;
    }

    public void startEngine(){
        System.out.println("Start Engine");
    }


    public void stopEngine(){
        System.out.println("stop Engine");
    }

}
