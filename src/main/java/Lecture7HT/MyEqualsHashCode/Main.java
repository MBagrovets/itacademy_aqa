package Lecture7HT.MyEqualsHashCode;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
    }
}
