package com.company;

public class Main {

    public static void main(String[] args) {
        Dog bird = new Dog("Кеша", 2, false);
        Ket pigeon1 = new Ket("Fred", 1, false);
        Ket pigeon2 = new Ket("Jeff", 2 , true);
        System.out.println(bird.toString() + pigeon1.toString() + pigeon2.toString());
        pigeon1.fly();
        pigeon2.fly();
    }
}
