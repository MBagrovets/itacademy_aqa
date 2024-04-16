package Lecture9HT.Streams;

//3. Используйте стрим для коллекции и попрактикуйтесь следующие методы:
//- map(interface Function)
//- sorted(interface Comparator)
//- filter(interface Predicate)
//- forEach(interface Consumer)
//- count
//- toList

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestStreams {
    private static class Student{
        final int age;
        final String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        final List<Student> students = new ArrayList<Student>(){{
            add(new Student(36,"Anna"));
            add(new Student(35,"Victor"));
            add(new Student(34,"Valery"));
            add(new Student(33,"Marina"));
            add(new Student(32,"Kate"));
            add(new Student(31,"Irina"));
            add(new Student(29,"Valentina"));
            add(new Student(28,"Anna"));
            add(new Student(27,"Pavel"));
            add(new Student(35,null));
            add(new Student(29,null));
        }};

//        Это тоже, что и стрим, но длиннее:
//        int counter = 0;
//        for(Student student: students){
//            if(student.age > 30 && (student.name = null || student.name.length() <=4)){
//                counter++;
//            }
//        }

        long count = students.stream()
                .filter(student -> student.age>30)
                .map(student -> student.name)
                .filter(name -> name == null || (name.length() > 4 || !name.contains("A")))
                .filter(Objects::nonNull) //тоже что и name != null
                .sorted()
                .peek(System.out::println)
                .count();

        System.out.println(count);
        System.out.println();

        students.stream()
                .filter(student -> student.age<30)
                .map(student -> student.name)
                .forEach(System.out::println);

        System.out.println();

        List<String> namesUnder30AndNotNull = students.stream()
                .filter(student -> student.age < 30)
                .map(student -> student.name)
                .filter(name -> name != null)
                .sorted()
                .collect(Collectors.toList()); //преобразует элементы потока данных в список

        System.out.println(namesUnder30AndNotNull);
    }
}
