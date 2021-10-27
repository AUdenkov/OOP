package com.company.details;

import java.util.Scanner;

public class Transmission {
    private byte numberOfGears;
    private byte stateNumberOfGears = 0;

    public Transmission(byte numberOfGears) {
        this.numberOfGears=numberOfGears;
    }

    public void setNumberOfGears(byte numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public byte getNumberOfGears() {
        return this.numberOfGears;
    }

    public byte getStateNumberOfGears() {
        return this.stateNumberOfGears;
    }

    public void changeNumberOfGears() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("changeNumberOfGears (+ or -)");
        String change = scanner.nextLine();
        switch (change) {
            case "+":
                this.stateNumberOfGears++;
                break;
            case "-":
                this.stateNumberOfGears--;
                break;
        }
    }

}