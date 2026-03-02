package Backend9_Synchronization;

public class main {
    public static void main(String[] args) {
        Count count=new Count();

        Adder adder=new Adder();
        Subtractor subtractor=new Subtractor();

        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(subtractor);
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // waits for threads to complete
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count.value);
    }
}
