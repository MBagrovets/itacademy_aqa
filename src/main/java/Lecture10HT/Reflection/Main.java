package Lecture10HT.Reflection;

//3. Поиграйтесь с рефлексией для любого класса

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Main {
        public static void main(String[] args) {
            Class<ClassForReflection> clazz = ClassForReflection.class;

            // Вывод конструкторов с модификаторами доступа
            System.out.println("Constructors:");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                int modifiers = constructor.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " " + constructor);
            }

            // Вывод методов с модификаторами доступа и типами возвращаемых значений
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " " + method.getReturnType().getSimpleName() + " " + method.getName());
            }

            // Вывод полей с модификаторами доступа и типами
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                System.out.println(Modifier.toString(modifiers) + " " + field.getType().getSimpleName() + " " + field.getName());
            }
        }
}
