package Core.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top o the stack");
    }
}

class ThreadTestDrive {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
        System.out.println("Back in main");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        String s = null;
        char t1 = s.charAt(0);



    }
}