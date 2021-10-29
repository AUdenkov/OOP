package com.company.details;

import java.util.Scanner;

public class GasTank {
    private int size;
    private int state = 0;

    public GasTank(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

    public int refill() {
        System.out.println("how much should you fill");
        Scanner scanner = new Scanner(System.in);
        int addFuel = scanner.nextInt();
        if (getSize() - getState() < addFuel) {
            System.out.println("There is no place");
            refill();
        } else {
            int changeState = getState() + addFuel;
            setState(changeState);
        }
        return this.state;
    }


}
