import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q5Executor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int fileNumber = i;

            Runnable task = () -> {
                System.out.println("Downloading file " + fileNumber + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executor.submit(task);
        }
        executor.shutdown();
    }
}





















//ExecutorService manages a pool of threads, only task/logic is passed to executor service (Runnable).
//The tasks given are assigned to worker threads in the pool
//It does - Pick a thread from pool then call task.run() in that thread.