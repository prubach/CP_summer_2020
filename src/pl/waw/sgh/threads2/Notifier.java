package pl.waw.sgh.threads2;

public class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String myThreadName = Thread.currentThread().getName();
        System.out.println(myThreadName + " started");
        try {
            Thread.sleep(2000);
            synchronized (msg) {
                msg.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
