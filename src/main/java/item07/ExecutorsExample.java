package item07;

import static java.lang.Thread.*;

public class ExecutorsExample {
    public static void main(String[] args) {
        int cpu = Runtime.getRuntime().availableProcessors();

        Thread thread = new Thread(() -> {
            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread.start();
    }
}
