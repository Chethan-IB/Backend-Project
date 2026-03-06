package Backend13_StreamsLamdas;

public class Client {
    public static void main(String[] args) {
    Thread thread = new Thread(new Hello());
    thread.start();



    Runnable task = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello World, Thread name: " + Thread.currentThread().getName());
        }
        // Lamda only with functional interface
        Thread t2 = new Thread( () -> {
            System.out.println("Hello World, Thread name: " + Thread.currentThread().getName());

        } );
    ;;};
    }
}
