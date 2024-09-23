package MultiThreading.JoinMethod;

import MultiThreading.UsingRunnableThread.ImplementingRunnable;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException{
        ImplementingRunnable p1=new ImplementingRunnable('*');
        ImplementingRunnable p2=new ImplementingRunnable('$');
        ImplementingRunnable p3=new ImplementingRunnable('#');

        Thread  t1=new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread  t2=new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
t1.join();
        Thread  t3=new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();


    }


}
