package Backend9_Synchronization;

public class Adder implements Runnable {

    private Count count;


    public Adder(Count count) {

    }

    @Override
    public void run() {
        for(int i=1;i<100;i++) {
            count.value +=i;
        }
    }
}
