package com.company;

import com.company.car.Car;
import com.company.details.Engine;
import com.company.details.GasTank;
import com.company.details.Transmission;

public class Main {

    public static void main(String[] args) {
        Engine engine1 = new Engine("BMW", 20, 300);
        GasTank gasTank1 = new GasTank(60);
        Transmission transmission1 = new Transmission(6);
        Car car1 = new Car("BMW", engine1, gasTank1, transmission1);
        car1.getGasTank().setState(50);
        System.out.println(car1.getGasTank().getState());
        car1.refill();
        System.out.println(car1.getGasTank().getState());
        car1.startCar();
        System.out.println(car1.getGasTank().getState());
        car1.changeNumberOfGears();
        System.out.println(car1.getGasTank().getState());
        car1.changeNumberOfGears();
        System.out.println(car1.getGasTank().getState());
        car1.turnCar();
        System.out.println(car1.getGasTank().getState());
        car1.stopCar();
    }
}

