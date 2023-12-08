package prac_est;

class Test {
    synchronized public void test(int a) {
        for (int i = 0; i < 10; i++) {
            System.out.println("we got called" + a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class ThreadSync1 extends Thread {
    Test test;

    ThreadSync1(Test t) {
        test = t;
    }

    public void run() {
        test.test(0);

    }

}

class ThreadSync2 extends Thread {
    Test test;

    ThreadSync2(Test t) {
        test = t;
    }

    public void run() {
        test.test(1);

    }

}

public class ThrSy {
    public static void main(String[] args) {
        Test t = new Test();
        Thread t1 = new ThreadSync1(t);
        Thread t2 = new ThreadSync2(t);
        t1.start();
        t2.start();
    }
}
