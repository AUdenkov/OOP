package com.company.details;

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
        this.state=state;
    }

    public int getState() {
        return this.state;
    }

    public int refill() {
        return this.state = 10;
    }


}
