package Lecture7HT.toStringEqualsHashCodeStatic;

public class Test {
    public static void main(String[] args) {
        HumanToStringStatic h1 = new HumanToStringStatic("Bill",25);
        System.out.println(h1);
        HumanToStringStatic h2 = new HumanToStringStatic("Bill", 25);
        System.out.println(h2);
        System.out.println();

        AnimalEqualsHashCode animal1 = new AnimalEqualsHashCode(1);
        AnimalEqualsHashCode animal2 = new AnimalEqualsHashCode(1);
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        System.out.println();

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println();

        HumanToStringStatic.getDescription();
    }
}