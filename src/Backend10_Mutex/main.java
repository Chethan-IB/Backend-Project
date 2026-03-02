package Backend10_Mutex;

import Backend9_Synchronization.Adder;
import Backend9_Synchronization.Count;
import Backend9_Synchronization.Subtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) {
        Backend9_Synchronization.Count count=new Count();
        Lock lock=new ReentrantLock();
        Backend9_Synchronization.Adder adder=new Adder(count,lock);
        Subtractor subtractor=new Subtractor(count,lock);

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
