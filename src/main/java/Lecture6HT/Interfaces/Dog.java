package Lecture6HT.Interfaces;

public class Dog implements Voice, Swimming, Movement{
    @Override
    public void voice(){
        System.out.println("Bark!");
    }

    @Override
    public void swimming() {
        System.out.println("I can swim");
    }

    @Override
    public void jump() {
        System.out.println("I can jump");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void climb() {
        System.out.println("I climb very bad");
    }

    @Override
    public void smile() {
        System.out.println("My smile is funny");
    }

    @Override
    public void dive() {
        System.out.println("Sometimes I dive");
    }
}
