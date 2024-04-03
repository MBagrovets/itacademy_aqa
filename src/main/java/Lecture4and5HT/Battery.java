package Lecture4and5HT;

public class Battery {
        private int battery1;
        private String battery2;

        public Battery (int battery1, String battery2){
            this.battery1 = battery1;
            this.battery2 = battery2;
            System.out.println("First Battery");
        }
        public Battery (int battery1) {
            this.battery1 = battery1;
            System.out.println("Second Battery");
        }
        public Battery (){
            System.out.println("Default Battery");
        }
    }

