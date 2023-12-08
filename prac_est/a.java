package prac_est;

import java.io.PipedReader;
import java.io.PipedWriter;

public class a {
    public static void main(String[] args) {
        try {
            final PipedReader pr = new PipedReader();
            final PipedWriter pw = new PipedWriter(pr);

            Thread readThread = new Thread(() -> {
                try {
                    int data = pr.read();
                    while (data != -1) {
                        System.out.print((char) data);
                        data = pr.read();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            Thread writeThread = new Thread(() -> {
                String st = "i am suraj";
                try {
                    pw.write(st.toCharArray());
                    pw.close(); // Close the writer after writing
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            writeThread.start();
            readThread.start();

            // Wait for the readThread to finish before moving on
            // readThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
