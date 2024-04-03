package Lecture4and5HT;

public class Motorhome {
    private int kitchen = 1;


    public Motorhome(){
        System.out.println("Is it Motorhome");
    }
    public Motorhome(int kitchen){
        this.kitchen = kitchen;
        System.out.println("Motorhome has a kitchen");
    }
}


class Wheels1 extends Motorhome{
    public Wheels1(int kitchen){
        super (kitchen);
    }
}

class Wheels2 extends Wheels1{

    public Wheels2 (int kitchen) {
        super(kitchen);
    }
}