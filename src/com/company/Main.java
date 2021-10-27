package com.company;

import com.company.details.Engine;

public class Main {

    public static void main(String[] args) {
        Engine eng=new Engine();
        Engine eng1=new Engine("porshe",123,300);
        eng1.setBrend("BMW");
        eng1.startEngine();
        eng1.stopEngine();
        System.out.println(eng1.getBrend());
    }
}

