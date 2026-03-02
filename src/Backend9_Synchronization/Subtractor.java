package Backend9_Synchronization;

public class Subtractor implements Runnable {

    private Count count;

    public Subtractor() {
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) count.value -= i;
    }
}
