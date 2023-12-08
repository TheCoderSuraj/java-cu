package prac_est;

import java.io.PipedReader;
import java.io.PipedWriter;

public class pwr {
    public static void main(String[] args) {
        try {
            final PipedReader pr = new PipedReader();
            final PipedWriter pw = new PipedWriter(pr);

            Thread readThread = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        int data = pr.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = pr.read();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            });
            Thread writeThread = new Thread(new Runnable() {

                @Override
                public void run() {
                    // String st = ;
                    try {
                        pw.write("i am suraj".toCharArray());
                        pw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            });
            readThread.start();
            writeThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
