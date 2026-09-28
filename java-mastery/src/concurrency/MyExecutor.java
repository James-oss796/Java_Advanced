package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Runnable task = () -> System.out.println("Working....");
        executor.execute(task);
        System.out.println("Still running");

        executor.shutdown();


    }
}
