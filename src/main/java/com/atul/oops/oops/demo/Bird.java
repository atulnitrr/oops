package com.atul.oops.oops.demo;

public class Bird  extends Animal{


    public Bird(int age, String gender) {
        super(age, gender);
    }

    public void  fly() {
        System.out.println("flying --> ");
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("Inside eat");
    }
}
