package com.example.bird;

public class Parrot extends Bird{
    public Parrot(String name, String color){
        super(name, color);
    }
    @Override
    public void speak(){
        System.out.println("I am so green");
    }
}
