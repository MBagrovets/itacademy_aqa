package Lecture8HT.Collections;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        example1();
    }

    public static void example1() {
        hashSetExample();
        treeSetExample();
        linkedHashSetExample();
        ArrayListExample();
        HashMapExample();
    }

    public static void hashSetExample(){
        Set <Student> students = new HashSet();

        Student student1 = new Student ("Bill");
        Student student2 = new Student ("Ann");
        Student student3 = new Student ("Bill"); //дубликат

        students.add(student1);
        students.add(student2);
        students.add(student3); //попытка добавить дубликат

        System.out.println("HashSet:");

        Iterator <Student> iterator = students.iterator(); // проход по коллекции с помощью итератора

        while(iterator.hasNext()){  //not ordered - порядок получения не такой же, как порядок вставки
            Student student = iterator.next();
            System.out.println(student.getName());

        }System.out.println();

        // Удаление второго элемента из HashSet с использованием стримов
        students.remove(students.stream().skip(1).findFirst().orElse(null));

        // Распечатка коллекции Student после удаления
        System.out.println("HashSet after removing element:");
        for (Student student : students) {
            System.out.println(student.getName());
        }System.out.println();
    }

    public static void treeSetExample() { //sorted - через класс
        TreeSet<Student> students = new TreeSet<>();

        Student student1 = new Student("Clare");
        Student student2 = new Student("Ann");
        Student student3 = new Student("Mary");
        Student student4 = new Student("Bill");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("TreeSet:");

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName());

        }
        System.out.println();
        // Удаление второго элемента из TreeSet с использованием стримов
        students.remove(students.stream().skip(1).findFirst().orElse(null));

        // Распечатка TreeSet после удаления
        System.out.println("TreeSet after removing element:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }


    public static void linkedHashSetExample(){ //ordered
        LinkedHashSet <Student> students = new LinkedHashSet();

        Student student1 = new Student ("Yan");
        Student student2 = new Student ("Ann");
        Student student3 = new Student ("Peter");
        Student student4 = new Student ("Bill");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("LinkedHashSet:");

        Iterator <Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName());

        }System.out.println();
        // Удаление второго элемента из LinkedHashSet с использованием стримов
        students.remove(students.stream().skip(1).findFirst().orElse(null));

        // Распечатка LinkedHashSet после удаления
        System.out.println("LinkedHashSet after removing element:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }

    public static void ArrayListExample(){
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student ("Pavel");
        Student student2 = new Student ("Anastasia");
        Student student3 = new Student ("Ivan");
        Student student4 = new Student ("Anastasia"); // в ArrayList могут быть дубликаты

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("ArrayList:");

        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName());

        }System.out.println();

        Student student = students.get(1); // Получить второго студента (с индексом 1)
        System.out.println("Student at index 1: " + student.getName());
        System.out.println();

        students.remove(1); // Удалить второго студента (с индексом 1)
        System.out.println("ArrayList after removing the element");
        for (Student s : students) {
            System.out.println(s.getName());
        }
        System.out.println();
    }
    public static void HashMapExample() {

        Student student1 = new Student("John");
        Student student2 = new Student("Mary");
        Student student3 = new Student("David");

        // Использование HashMap для хранения студентов
        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);

        // Распечатка HashMap
        System.out.println("HashMap:");
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
        }
        System.out.println();

        Student student = hashMap.get(1); // Получить студента с ключом 1
        System.out.println("Student with key 1: " + student.getName());

        hashMap.remove(2); // Удалить элемент с ключом 2

        System.out.println();
        // Вторая рспечатка HashMap
        System.out.println("hashMap after removing the element:");
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
        }
    }
}

