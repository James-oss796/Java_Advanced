package concurrency;

public class Main{
    public static void main(String[] args){

    Runnable task = () -> System.out.println("Running....");
    Thread thread = new Thread(task);
    thread.start();
    System.out.println("End");
    System.out.println("Worker");

    Thread worker = new Thread( () -> System.out.println("Working...."));
    worker.start();
    //worker.join();
    System.out.println("Finished");


    Runnable printer = () -> {
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    };


    Thread t1 = new Thread(printer, "worker-1");
    Thread t2 = new Thread(printer, "worker-2");

    
    t1.start();
    t2.start();




  
    
}

}
