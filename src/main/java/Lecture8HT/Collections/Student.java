package Lecture8HT.Collections;

//Создайте класс Student и используйте его в коллекциях ArrayList, HashSet, LinkedHashSet, TreeSet, HashMap.
// Для каждой коллекции используйте методы для добавления, получения(только для ArrayList и HashMap),
// удаления элементов, расспечатайте коллекции

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
