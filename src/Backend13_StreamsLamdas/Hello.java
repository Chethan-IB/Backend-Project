package Backend13_StreamsLamdas;

public class Hello implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World, Thread name: " + Thread.currentThread().getName());
    }
}
