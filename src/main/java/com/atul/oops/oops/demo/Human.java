package com.atul.oops.oops.demo;

public class Human {
    String name;
    int age;
    int height;


    public Human() {
    }

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void speak() {
        System.out.println("Hello my name is " + this.name);
    }

    public void eat() {
        System.out.println("Eating data");
    }
}
