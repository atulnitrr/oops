package com.atul.oops.oops.demo;

public class Animal {


    int age;
    String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("eating -->< ");
    }

    public void sleep( ) {
        System.out.println("Sleeping --> ");
    }
}
