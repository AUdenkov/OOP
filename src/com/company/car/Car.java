package com.company.car;

import com.company.details.Engine;
import com.company.details.GasTank;
import com.company.details.Transmission;
import com.company.person.Person;

public class Car {
    private String nameCar;
    private int number;
    private Engine engine;
    private GasTank gasTank;
    private Transmission transmission;
    private Person person;

    public Car(String nameCar, int number, Engine engine, GasTank gasTank, Transmission transmission, Person person) {
        this.nameCar = nameCar;
        this.number = number;
        this.engine = engine;
        this.gasTank = gasTank;
        this.transmission = transmission;
        this.person = person;
    }

    public Car(String nameCar, Engine engine, GasTank gasTank, Transmission transmission) {
        this.nameCar = nameCar;
        this.engine = engine;
        this.gasTank = gasTank;
        this.transmission = transmission;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return this.nameCar;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public void startCar() {
        if (gasTank.getState() == 0) {
            System.out.println("No GAS");
        } else {
            engine.startEngine();
            transmission.changeNumberOfGears();
            System.out.println("started moving");
            System.out.println("car move with number of  gears " + transmission.getStateNumberOfGears());
        }
    }

    public void stopCar() {
        System.out.println("stopped");
    }

    public void turnCar() {
        System.out.println("Car turned");
    }
}


