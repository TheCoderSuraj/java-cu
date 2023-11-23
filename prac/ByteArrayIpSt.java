package prac;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteArrayIpSt {
    public static void main(String[] args) {
        String path = "test.txt";

        // String st1 = "this is test for bais";
        // byte buf1[] = st1.getBytes();
        // ByteArrayInputStream bais1 = new ByteArrayInputStream(buf1);
        // int c;
        // while ((c = bais1.read()) != -1) {
        // System.out.print((char) c);
        // }

        // with file input stream
        File file = new File(path);
        byte buf[] = new byte[(int) file.length()];
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read(buf);
            ByteArrayInputStream bais = new ByteArrayInputStream(buf);

            // don't use while loop with (bais.read() != -1)
            for (int i = 0; i < file.length(); i++) {
                System.out.print((char) bais.read());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
