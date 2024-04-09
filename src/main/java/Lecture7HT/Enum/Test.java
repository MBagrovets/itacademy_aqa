package Lecture7HT.Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.BIRD;

        switch (animal){
            case BIRD:
                System.out.println("Bird");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case HORSE:
                System.out.println("Horse");
                break;
            default:
                System.out.println("Unidentified animal");
        }

        System.out.println(animal.name() + " can " + animal.getAction());

        animal.setAction("I'm a little bird");
        System.out.println(animal.getAction());

        Animal dog = Animal.valueOf("DOG");
        System.out.println(dog.getAction());

        Animal horse = Animal.HORSE;
        System.out.println(horse.ordinal());  // индекс
    }
}
