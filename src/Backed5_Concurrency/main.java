package Backed5_Concurrency;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World, This is printed by "+ Thread.currentThread().getName());


        HelloWorldPrinterTask task = new HelloWorldPrinterTask();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
