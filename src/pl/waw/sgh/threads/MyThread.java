package pl.waw.sgh.threads;

public class MyThread extends Thread {

    private String name;
    private int iterator;

    public MyThread(String name) {
        this.name = name;
    }

    public int getIterator() {
        return iterator;
    }

    @Override
    public void run() {
        try {
            while (iterator < 10) {
                iterator++;
                System.out.println(name + ": " + iterator);
                    this.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted...." + name + " at: " + iterator);
        }

    }
}
