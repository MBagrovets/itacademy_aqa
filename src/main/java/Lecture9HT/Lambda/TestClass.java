package Lecture9HT.Lambda;

//2. Напишите свой функциональный интерфейс с генериком и напишите лямбда функцию для него

import Lecture8HT.Collections.Student;

import java.sql.SQLOutput;

public class TestClass {

    public static void main(String[] args) {

        int score = 6;

        NewStudents<Integer> student = (score1) -> {
            if (score1 <= 10 && score1 >=7) {
                return score1;
            } else {
                System.out.println("I can't study in this class");
                return score1;
            }
        };

        System.out.println("My middle score is " + student.MiddleScore(score));
    }
}
