package com.company;

public class Ket extends Dog {
    private Color colorOfPlumage;
    private Object Color;

    public Ket(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm ket, but i'm a Ket");
    }

    public void poo() {
        System.out.println("i'm poo on the car :)");
    }

    public String getColor() {
        return (String) Color;
    }

    @Override
    public String toString() {
        return "Ket;{" +
                "Color=" + Color +
                '}';
    }
}