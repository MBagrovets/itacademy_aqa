package com.itacademy;

public class Engine {
    private int engine1;
    private String engine2;

    public Engine (int engine1, String engine2){
        this.engine1 = engine1;
        this.engine2 = engine2;
        System.out.println("First Engine");
    }
    public Engine (int engine1) {
        this.engine1 = engine1;
        System.out.println("Second Engine");
    }
    public Engine (){
        System.out.println("Default Engine");
    }
}

