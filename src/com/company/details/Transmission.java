package com.company.details;

import java.util.Scanner;

public class Transmission {
    private int numberOfGears;
    private int stateNumberOfGears = 0;

    public Transmission(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setNumberOfGears(byte numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return this.numberOfGears;
    }

    public int getStateNumberOfGears() {
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
        System.out.println(stateNumberOfGears);

    }

}