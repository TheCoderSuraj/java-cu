package prac;

class mThread extends Thread {
    public void run() {
        System.out.println("we got call from thread");
    }
}

class iThread implements Runnable {
    public void run() {
        System.out.println("we got call from iThread runnable");
    }
}

public class thread {
    public static void main(String[] args) {
        Thread mt = new mThread();
        mt.start();

        iThread i = new iThread();
        Thread m2 = new Thread(i);
        m2.start();
    }
}
