package Lecture4and5HT;

public final class Track {
    private int Count = 1;

    public Track (int Count){
        this.Count = Count;
        System.out.println("1 track");
    }

    public static void printInfo(){
        System.out.println("Метод принимает параметры");
    }

    public static void printInfo(String X){
        System.out.println("Метод принимает String");
    }

    public static void printInfo(int X){
        System.out.println("Метод принимает int");
    }
}
