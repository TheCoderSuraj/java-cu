// package mst2;

class Test extends Thread {
    public void run() {
        System.out.println("we get called from thread extends");
    }
}

class Test2 implements Runnable {
    public void run() {
        System.out.println("we got called from runnable thread");
    }
}

public class thread_test {
    public static void main(String[] arg) {
        Test t = new Test();
        Thread t2 = new Thread(new Test2());
        t.start();
        t2.start();

    }
}
