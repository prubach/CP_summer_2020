package pl.waw.sgh.threads2;

import java.text.SimpleDateFormat;

public class OurThreads {

    public static void main(String[] args) {

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(System.currentTimeMillis());
        //System.out.println(sdf.format(System.currentTimeMillis()));

        Message msg = new Message("Hello Threads!!");
        Waiter w1 = new Waiter(msg);
        Notifier n1 = new Notifier(msg);
        Thread t1 = new Thread(w1);
        t1.start();
        Waiter w2 = new Waiter(msg);
        Thread t3 = new Thread(w2);
        t3.start();



        Thread t2 = new Thread(n1);
        t2.start();

    }
}
