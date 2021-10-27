package com.company;

import com.company.car.Car;
import com.company.details.Engine;
import com.company.details.GasTank;
import com.company.details.Transmission;

public class Main {

    public static void main(String[] args) {
        Engine engine1 = new Engine("BMW", 20, 300);
        GasTank gasTank1 = new GasTank(60);
        Transmission transmission1 = new Transmission((byte) 6);
        Car car1 = new Car("BMW", engine1, gasTank1, transmission1);
        Engine engine2=new Engine("VW",30,400);
        GasTank gasTank2=new GasTank(80);
        Transmission transmission2=new Transmission((byte) 8);
        Car car2=new Car("VW",engine2,gasTank2,transmission2);
        gasTank1.refill();
        gasTank2.refill();
        car2.getGasTank();
        car1.startCar();
    }
}

