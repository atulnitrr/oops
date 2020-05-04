package com.atul.oops.oops.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildTest {

    @Test
    void test() {
        Child child = new Child("name");
        child.move();
        child.secondMove();
    }
}