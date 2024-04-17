package Lecture10HT.Threads;

// 1. Создайте два потока при помощи Thread и Runnable, переопределится метод run и запустите потоки

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); //не run, а именно start!

        MyThread myThread1 = new MyThread();
        myThread1.start();

        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("In method Main");

        Thread thread1 = new Thread(new Runner());
        thread1.start();

    }
}
