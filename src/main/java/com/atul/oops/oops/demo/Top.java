package com.atul.oops.oops.demo;

public abstract class Top {

    private String name;

    public Top(String name) {
        this.name = name;
    }

    public abstract void secondMove() ;

    public void move() {
        System.out.println("Moving " + this.name);
    }

}
