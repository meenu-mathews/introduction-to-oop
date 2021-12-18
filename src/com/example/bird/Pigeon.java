package com.example.bird;

public class Pigeon extends Bird{

    public Pigeon(String name, String color){
        super(name, color);
    }
    public void eatPizza(){
        System.out.println("Delicious pizza!");
    }
    public void Sleep(){
        System.out.println("I'm a sleeping pigeon");
    }
}
