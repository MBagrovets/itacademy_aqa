package Lecture7HT.toStringEqualsHashCodeStatic;

public class HumanToStringStatic {
        private String name;
        private int age;

        public static String description = "Awesome Human!";
        public HumanToStringStatic(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString(){
            return name+","+age;
        }

        public static void getDescription(){
            System.out.println(description);
        }
}

