package Backend6_Concurrency2;

public class main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            NumberPrinter printer = new NumberPrinter(i);
            Thread t = new Thread(printer);
            t.start();
        }
    }
}
