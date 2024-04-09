package Lecture7HT.MyEqualsHashCode;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверка на сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // проверка на null и сравнение классов

        Person person = (Person) obj; // Приведение типа (Даункастинг)

        // Сравнение полей
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // переопределение метода hashCode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
