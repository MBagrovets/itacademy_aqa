package Lecture4and5HT;

public class Radiator {
    private int radiator1;
    private String radiator2;

    public Radiator (int radiator1, String radiator2){
        this.radiator1 = radiator1;
        this.radiator2 = radiator2;
        System.out.println("First Radiator");
    }
    public Radiator (int radiator1) {
        this.radiator1 = radiator1;
        System.out.println("Second Radiator");
    }
    public Radiator (){
        System.out.println("Default Radiator");
    }
}

