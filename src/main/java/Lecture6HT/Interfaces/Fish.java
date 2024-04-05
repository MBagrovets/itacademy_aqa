package Lecture6HT.Interfaces;

public class Fish implements Swimming{
    @Override
    public void swimming() {
        System.out.println("I can swim");
    }

    @Override
    public void dive() {
        System.out.println("Fish can dive");
    }
}
