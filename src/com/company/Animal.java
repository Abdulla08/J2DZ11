package com.company;

public class Animal {
    private String name;
    private int age;
    private boolean isDead;

    private void speak(){
        System.out.println("i' m animal");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isDead() {
        return isDead;
    }

    public Animal(String name, int age, boolean isDead) {
        this.name = name;
        this.age = age;
        this.isDead = isDead;
    }
}
