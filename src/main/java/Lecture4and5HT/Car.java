package Lecture4and5HT;

public class Car extends Transport {
        public Car (int height) {
            super(height);
        }

        @Override
        public void color(){
            System.out.println("Red");
        }

        public static void nonAbstractMethod(){
            System.out.println("Car method");
        }

        private Engine engine;
        private Battery battery;
        private Radiator radiator;

        public Car (Engine engine, Battery battery, Radiator radiator){
            this.engine = engine;
            this.battery = battery;
            this.radiator = radiator;
        }
}

