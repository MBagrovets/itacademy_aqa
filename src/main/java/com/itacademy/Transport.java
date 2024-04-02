package com.itacademy;

public abstract class Transport {
    private String model;

    public abstract void color();

    public void setModel (String model){
        this.model = model;
    }
    public String getModel (){
        return model;
    }

    private int height;
    private int weight;
    private int maxSpeed;


    public void method1(){
        System.out.println("I have a method");
    }

    public Transport (){
        this.model = "123";
        System.out.println("1st default Constructor for " +model+" model");
    }

    public Transport (String model, int height, int weight, int maxSpeed){
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        System.out.println("2nd constructor");
    }

        public Transport (int height){
        this.height = height;
        System.out.println("3rd constructor");
    }

    public static void nonAbstractMethod(){
        System.out.println("Non abstract method");
    }

}
