package pl.waw.sgh.threads;

public class AllThreads {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("thread-1");
        MyThread myThread2 = new MyThread("thread-2");
        //myThread1.run();
        //myThread2.run();
        myThread1.start();
        myThread2.start();

        try {
            Thread.sleep(2000);
            myThread1.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting my main thread");
    }
}
