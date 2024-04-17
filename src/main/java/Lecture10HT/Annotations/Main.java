package Lecture10HT.Annotations;
import java.lang.annotation.Annotation;

//2. Создайте свою аннотацию и добавьте в свой класс-модель
public class Main {
    public static void main(String[] args) {

        Annotation[] parentAnnotations = Parent.class.getAnnotations();
        Annotation[] childAnnotations = Child.class.getAnnotations();

        System.out.println("Parent Annotations:");
        for (Annotation annotation : parentAnnotations) { //вывести аннотации, примененные к классам Parent и Child через for-each, чтобы перебрать каждую А. в массиве и вывести ее
            System.out.println(annotation);
        }

        System.out.println("Child Annotations:");
        for (Annotation annotation : childAnnotations) {
            System.out.println(annotation);
        }
    }
}
