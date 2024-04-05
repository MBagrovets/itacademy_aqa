package Lecture6HT.Interfaces;

public interface Movement {
    public void walk();
    public void run();
    public void jump();

    public default void climb(){

    };
}
