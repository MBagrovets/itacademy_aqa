package Lecture6HT.Interfaces;

public interface Voice {
    public void voice();

    public default void smile(){
        System.out.println("I'm smiling");
    }
}
