package Lecture10HT.Reflection;

public class ClassForReflection {
    private int id;
    public String name;

    public ClassForReflection(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}