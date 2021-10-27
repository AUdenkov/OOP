package com.company.details;

public class Engine {
    private String brend;
    private int number;
    private int power;

    public Engine(String brend, int number, int power){
        this.brend=brend;
        this.number=number;
        this.power=power;
    }

    public String getBrend(){
        return this.brend;
    }

    public void setBrend(String brend){
        this.brend=brend;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power=power;
    }

    public void startEngine(){
        System.out.println("GO_GO");
    }

    public void stopEngine(){
        System.out.println("stop");
    }
}
