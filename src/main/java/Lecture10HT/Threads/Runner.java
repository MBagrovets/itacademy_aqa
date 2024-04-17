package Lecture10HT.Threads;

public class Runner implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println("Runnable thread" + i);
        }
    }
}
