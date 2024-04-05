package Lecture6HT.Interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();
        Cat cat = new Cat();

        cat.voice();
        cat.run();
        cat.climb();
        cat.jump();
        cat.walk();
        cat.smile();
        System.out.println();
        dog.voice();
        dog.dive();
        dog.jump();
        dog.run();
        dog.swimming();
        dog.walk();
        dog.smile();
        System.out.println();
        fish.dive();
        fish.swimming();


    }
}
