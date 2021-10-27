package com.company.person;

public class Person {
    private String namePerson;
    private byte agePerson;

    public Person(String namePerson, byte agePerson){
        this.namePerson=namePerson;
        this.agePerson=agePerson;
    }

    public void setNamePerson(String namePerson){
        this.namePerson=namePerson;
    }

    public String getNamePerson(){
        return this.namePerson;
    }

    public void setAgePerson(byte agePerson){
        this.agePerson=agePerson;
    }

    public byte getAgePerson(){
        return this.agePerson;
    }
}
