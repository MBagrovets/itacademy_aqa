package Lecture6HT.Polymorphism;

import Lecture6HT.Polymorphism.Animal;
import Lecture6HT.Polymorphism.Cat;
import Lecture6HT.Polymorphism.Dog;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }
    public static void test (Animal animal){
        animal.eat();
    }
}
