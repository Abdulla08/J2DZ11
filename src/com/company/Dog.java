package com.company;

public class Dog extends Animal{
    private String color;
    private boolean canFly;

    public Dog(String name, int age, boolean isDead) {
        super(name, age, isDead);
    }

    public void fly(){
        System.out.println("I'm Dog");
    }

    public final void fly(boolean canFly){
        if (!canFly){
            System.out.println("I'm not can Dog");
        }else {
            System.out.println("I'm Dog");
        }
    }

    public void chirik(){
        System.out.println("Gav-gav");
    }

    public void chirik(boolean isGoose){
        if (isGoose){
            System.out.println("Gav-gav-gav");
        }
    }
    public String getColor() {
        return color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}