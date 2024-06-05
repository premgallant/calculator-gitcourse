package org.taco

public class Car {

    private String model;
    private String engineType;

    public Car(String model, String engineType) {
        this.model = model;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public void startEngine(){
        System.out.println(this.model+ " Engine started");
    }


    public void stopEngine(){
        System.out.println(this.model+ " Engine stopped");
    }

}
