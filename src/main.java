import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for (int i = 1; i <= 100; i++) {
        NumberPrinter printer = new NumberPrinter(i);
        executor.submit(printer);
    }
    }
}
