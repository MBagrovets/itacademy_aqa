package com.itacademy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Radiator radiator = new Radiator(1);
        Battery battery = new Battery(5, "Battery");
        Car car = new Car(engine,battery,radiator);
        Bus bus = new Bus("5 model", 4, 3, 2);
        car.setModel("model123");
        System.out.println(car.getModel());
        System.out.println(bus.getModel());
        System.out.println(Bus.getWheelcount());
        Bus.Transmissions();
        Track track = new Track(1);
        Car.nonAbstractMethod();
        Bus.nonAbstractMethod();
        Track.printInfo();
        Track.printInfo("String");
        Track.printInfo(3);
        Wheels2 kitchen = new Wheels2(2);
        int a = 0;
    }
}
