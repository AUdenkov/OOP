package com.company.details;

public class GasTank {
    private int size;
    private int state=0;
    public GasTank(){

    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return this.size;
    }

    public int getState(){
        return this.state;
    }
    public int refill(){
        return this.state=10;
    }


}
