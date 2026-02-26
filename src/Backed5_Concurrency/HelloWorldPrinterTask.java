package Backed5_Concurrency;

public class HelloWorldPrinterTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World, This is printed by "+ Thread.currentThread().getName());
    }
}
