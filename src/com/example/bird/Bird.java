package com.example.bird;

public abstract class Bird {
    protected String name;
    protected String color;

    public Bird(String name, String color){
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly(){
        System.out.println("Hi there! I can fly.");
    }
    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot papa = new Parrot("Papa", "Green");
        papa.speak();
    }
}

