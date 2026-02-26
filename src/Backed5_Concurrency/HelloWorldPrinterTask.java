package Backed5_Concurrency;

public class HelloWorldPrinterTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World, This is printed by "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
