package pl.waw.sgh.threads2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String getCurTime(){
        return sdf.format(new Date());
    }

    @Override
    public void run() {
        String myThreadName = Thread.currentThread().getName();
        System.out.println(myThreadName + " starts to execute at: " + getCurTime());
        synchronized (msg) {
            try {
                msg.wait();
                System.out.println(msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /// do some work....
        System.out.println(myThreadName + " got notified and finishes at: " +getCurTime());
    }
}
