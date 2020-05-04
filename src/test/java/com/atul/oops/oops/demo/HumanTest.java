package com.atul.oops.oops.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void name() {
        Human tom = new Human();
        tom.age = 23;
        tom.name = "data";
        tom.speak();
        tom.eat();
    }

    @Test
    void test_bird () {
        final Animal bird = new Bird(12, "M");
//        bird.fly();
        bird.eat();

        final Animal animal = new Animal(12, "M");
//        bird.fly();
        animal.eat();
    }
}