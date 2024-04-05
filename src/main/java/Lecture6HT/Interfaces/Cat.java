package Lecture6HT.Interfaces;

public class Cat implements Movement, Voice{
    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void jump() {
        System.out.println("I can jump");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void climb() {
        System.out.println("I can climb");
    }

    @Override
    public void smile() {
        System.out.println("My smile is nice");
    }
}
