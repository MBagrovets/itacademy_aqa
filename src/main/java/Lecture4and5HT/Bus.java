package Lecture4and5HT;

public class Bus extends Transport {
    public Bus(String model, int height, int weight, int maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    private static final String wheelcount = "4 wheels";

    public static String getWheelcount() {
        return wheelcount;
    }

    public static void Transmissions(){
        final int X = 5;
        System.out.println("5 transmissions");
    }

    @Override
    public void color(){
        System.out.println("Blue");
    }


}

